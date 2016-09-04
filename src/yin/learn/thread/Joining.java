package yin.learn.thread;

public class Joining {

    /**
     * @param args
     */
    public static void main(String[] args) {
          // TODO Auto-generated method stub
         Sleeper
         sleppy = new Sleeper( "Sleepy", 1500),
         grumpy = new Sleeper( "grumpy", 1500);
         
         Joiner
         dopey = new Joiner( "dopey", sleppy) ,
         doc = new Joiner( "doc", grumpy);
         //�߳�Joiner ���߳�Sleeper�ϵ���join()���Ǵ��߳�Joiner������֪��Sleeper�����Żָ�
    }

}
class Sleeper extends Thread{
    private int duration;
    public Sleeper (String name , int sleepTime){
         super(name);
         duration = sleepTime;
         start();
    }
    @Override
    public void run() {
          try {
        	  System.out.println(getName()+" start");
              sleep(duration);
         } catch (InterruptedException e) {
             System. out.println(getName()+ "Was interrupted."+
                        "isInterrupted():"+isInterrupted());
             e.printStackTrace();
         }
         System. err.println(getName()+ " has awakened");//�߳�����
    }
}
class Joiner extends Thread{
    private Sleeper sleeper;
    public Joiner(String name,Sleeper sleeper) {
          // TODO Auto-generated constructor stub
         super(name);
         this. sleeper = sleeper;
         start();
         
    }
    @Override
    public void run() {
          try {
        	  System.out.println(getName()+ " start");
        	  System.out.println(sleeper.getName()+"is alive:"+sleeper.isAlive());
        	  System.out.println("join"+sleeper.getName());

              sleeper.join();
        	  System.out.println(sleeper.getName()+"is alive:"+sleeper.isAlive());

         } catch (InterruptedException e) {
             System. out.println( "Interrupted");
         }
         System. out.println(getName()+ " join completed");
    }
}


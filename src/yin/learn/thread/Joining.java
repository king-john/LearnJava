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
         //线程Joiner 在线程Sleeper上调用join()，那此线程Joiner被挂起，知道Sleeper结束才恢复
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
         System. err.println(getName()+ " has awakened");//线程醒来
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


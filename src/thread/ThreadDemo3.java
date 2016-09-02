package thread;

public class ThreadDemo3 {
    public static void main(String[] args){
        Ticket t =new Ticket();
        Thread t1 = new Thread(t,"窗口一");
        Thread t2 = new Thread(t,"窗口二");
        Thread t3 = new Thread(t,"窗口三");
        Thread t4 = new Thread(t,"窗口四");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class Ticket implements Runnable{
    private int ticket =400;
    public void run(){
        while(true){
            synchronized (new Object()) {
          
                if(ticket==0)
                   break;
                System.out.println(Thread.currentThread().getName()+"---卖出一张票现在剩余"+--ticket);//
            }
        }
    }
}
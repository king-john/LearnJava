package thread;

public class ThreadDemo3 {
    public static void main(String[] args){
        Ticket t =new Ticket();
        Thread t1 = new Thread(t,"����һ");
        Thread t2 = new Thread(t,"���ڶ�");
        Thread t3 = new Thread(t,"������");
        Thread t4 = new Thread(t,"������");
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
                System.out.println(Thread.currentThread().getName()+"---����һ��Ʊ����ʣ��"+--ticket);//
            }
        }
    }
}
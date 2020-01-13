class Hisay implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("HI");
            try{Thread.sleep(500);}catch(Exception e){}

        }
    }
}
class Hellosay implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("HELLO");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
public class ThreadRunnable {
    public static void main(String args[])
    {
        Hisay obj1=new Hisay();
        Hellosay obj2=new Hellosay();

        Thread th1=new Thread(obj1);
        Thread th2=new Thread(obj2);
        th1.start();
        th2.start();
    }
}

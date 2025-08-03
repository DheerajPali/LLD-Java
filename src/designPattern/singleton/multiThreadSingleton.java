package designPattern.singleton;

public class multiThreadSingleton implements Runnable{
    public void run(){
        Singleton obj = Singleton.getObject();
        System.out.println( Thread.currentThread().getName() +" "+ obj );
    }
}

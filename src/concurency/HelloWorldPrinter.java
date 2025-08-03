package concurency;

public class HelloWorldPrinter implements Runnable {
    public void run(){
        System.out.println("running from thread : " + Thread.currentThread().getName());
    }
}

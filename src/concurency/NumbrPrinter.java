package concurency;

public class NumbrPrinter implements Runnable{
    //now I've to print dynamic number but run method doesn't accept any parameter now??
    //create a variable and pass it through constructor.

    private int number;

    public NumbrPrinter(int n){
        this.number = n;
    }

    @Override
    public void run(){
        System.out.println("The number is " + number + " using : " + Thread.currentThread().getName());
    }
}

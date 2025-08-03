package concurency;

import java.util.concurrent.*;

//Here in this class we've to return a value , so we cannot use Runnable, we will use CALLABLE here, it allows us to return value.
public class FibonacciUsingFixedThreadPool implements Callable<Integer> {

    //write simple code for fibonacci series , which I'll try to run with multiple threads.

    private int n;

    FibonacciUsingFixedThreadPool(int n){
        this.n = n;
    }

//    public int fib(int n){
//        if(n <= 1) return n;
//        return fib(n-1) + fib(n-2);
//    }

    @Override
    public Integer call() throws Exception {
        if(n <= 1) return n;
        ExecutorService ex = Executors.newFixedThreadPool(4);
//        return fib(n-1) + fib(n-2);
        Future<Integer> f1 = ex.submit(new FibonacciUsingFixedThreadPool(n-1));
        Future<Integer> f2 = ex.submit(new FibonacciUsingFixedThreadPool(n-2));

        int val1 = f1.get();
        int val2 = f2.get();
        System.out.println("Hello from main with thread name : " + Thread.currentThread().getName());
        return  val1+val2;
    }

}

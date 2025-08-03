package concurency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciUsingCachedThreadPool implements Callable<Integer> {

    private int n;

    public FibonacciUsingCachedThreadPool(int n){
        this.n = n;
    }

    //THINGS MAY TAKE TIME, BUT BELIEVE ME, IF YOU'RE A BELIEVER. THINGS WILL BOW DOWN IN FRONT OF YOU...... I CAN SAY BY EXPERIENCE OF 2 YEARS OF MY LEARNING JOURNEY.
    public Integer call() throws Exception{
        if(n <= 1) return n;
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Integer> f1 = ex.submit(new FibonacciUsingCachedThreadPool(n-1));
        Future<Integer> f2 = ex.submit(new FibonacciUsingCachedThreadPool(n-2));
        int val1 = f1.get();
        int val2 = f2.get();
        System.out.println("Hello from main with thread name : " + Thread.currentThread().getName());
        return val1+val2;
    }
}

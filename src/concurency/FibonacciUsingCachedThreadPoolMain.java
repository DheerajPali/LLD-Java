package concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciUsingCachedThreadPoolMain {

    public static  void main(String[] args) throws Exception{
        System.out.println("Hello dear, keep doing it ");

        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Integer> ans = ex.submit(new FibonacciUsingCachedThreadPool(6));
        int ans1 = ans.get();
        System.out.println(ans1);
    }
}

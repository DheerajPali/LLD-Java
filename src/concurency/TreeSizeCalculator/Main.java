package concurency.TreeSizeCalculator;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception{
        Node n = new Node(5);
        n.left = new Node(4);
        n.right = new Node(3);
        n.left.left = new Node(2);
        n.right.right = new Node(1);
//        new TreeSizeCalculatorUsingMultiThread(n);
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Integer>ans = ex.submit(new TreeSizeCalculatorUsingMultiThread(n));
//        System.out.println(ans.get());
    }
}

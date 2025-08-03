package concurency.TreeSizeCalculator;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TreeSizeCalculatorUsingMultiThread implements Callable<Integer> {
    private Node node;
    public TreeSizeCalculatorUsingMultiThread(Node node){
        this.node = node;
    }

    public Integer call() throws Exception{
        ExecutorService ex = Executors.newCachedThreadPool();
        if(node == null) return 0;
        Future<Integer> leftSize = ex.submit(new TreeSizeCalculatorUsingMultiThread(node.left));
        Future<Integer> rightSize = ex.submit(new TreeSizeCalculatorUsingMultiThread(node.right));
        System.out.println( Thread.currentThread().getName() + " : " + (1 + leftSize.get() + rightSize.get()) );
        return 1 + leftSize.get() + rightSize.get();
    }

}

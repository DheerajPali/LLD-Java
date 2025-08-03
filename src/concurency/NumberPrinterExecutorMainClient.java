package concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrinterExecutorMainClient {

    public static void main(String[] args){
        System.out.println("Hello I'm NumberPrinterExecutorMainClient");
        //Now first we'll create a thread pool of fixed size
        ExecutorService executorService = Executors.newFixedThreadPool(6);
//        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i = 1; i <= 100; i++){
            executorService.execute(new NumbrPrinter(i));
        }

    }
}

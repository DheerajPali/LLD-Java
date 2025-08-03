package concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws  Exception{
//        System.out.println("Hello from main with thread name : " + Thread.currentThread().getName());
//        System.out.println("Hello from main with thread name : " + Thread.currentThread().getName());

//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        Thread t = new Thread(helloWorldPrinter);
//        t.start();
//
//        //Printing number 1-100 using multi threading.
//        for(int i = 1; i <= 10 ; i++){
//            NumbrPrinter np = new NumbrPrinter(i);
//            Thread th = new Thread(np);
//            th.start();
//        }

        ExecutorService ex = Executors.newFixedThreadPool(1);
//        ex.execute(new FibonacciUsingFixedThreadPool(4));
        Future<Integer> ans = ex.submit(new FibonacciUsingFixedThreadPool(4));
        System.out.println(ans.get());


    }
}

//Java - by default uses -- Single Threaded -main thread.

//TASK 1 "Print Hello world from different thread --> not from main thread."

//SETUP
/* First create a task class
   Implement runnable interface in the class.
   Implement your task using run() method.
*/

//IMPLEMENTATION
/*
   Create Object of task class
   using task class object create a thread
   run the thread
*/


//TASK 2 "Print Numbers 1 to 100 using different threads.

/*
    Create a class NumberPrinter & Implements runnable
    Create object of NumberPrinter in main class (with parameter)
    crete thread
    start thread
 */
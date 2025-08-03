package designPattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main  {
    public static void main(String[] args){
//        Singleton obj1 = Singleton.getObject();
//        Singleton obj2 = Singleton.getObject();
//        Singleton obj3 = Singleton.getObject();


        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for(int i = 0; i < 10 ; i++){
            executorService.execute(new multiThreadSingleton());
        }
//        for(int i = 0; i < 30; i++){
//            multiThreadSingleton mt = new multiThreadSingleton();
//            Thread t = new Thread(mt);
//            t.start();
//        }

//        System.out.println(obj1);
//        System.out.println(obj2);
//        System.out.println(obj3);
    }


}

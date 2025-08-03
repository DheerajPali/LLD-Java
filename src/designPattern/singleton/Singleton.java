package designPattern.singleton;

public class Singleton {
    /*
        Private Constructor --so no one can create object.
        Public static Method --to create an object because our constructor is private. STATIC - so we can call it without object
        private static variable --so we can maintain single instance of class. and we want it to access from any method of class.
     */

    /*

     */

    private static Singleton instance = null;
    private Singleton(){

        //added try catch block to create a condition where multiple threads can generate multi objects if we didn't put double check.
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Constructor called by: " + Thread.currentThread().getName());
    }

    public static Singleton getObject() {
        if(instance == null){
            synchronized(Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}

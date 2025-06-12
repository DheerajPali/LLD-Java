package oops;

public class Calculator implements ICalculator {

    public static String name = "Dheeraj";
    public int age = 23;

    public static void printName(){
//        System.out.println(age); // Non-static field 'age' cannot be referenced from a static context
    }

    public void printAge(){
        System.out.println(name);
    }


    public void add(int a, int b){
        System.out.println("Addition result is : " + (a+b) );
    }

    public void substract(int a, int b){
        System.out.println("Substraction result is : " + (a-b));
    }

    public void multiply(int a, int b){
        System.out.println("Multiplication result is : " + (a*b));
    }

    public void divide(int a, int b){
        System.out.println("Dividation result is : " + (a/b));
    }

}

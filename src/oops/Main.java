package oops;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hey welcome to main class !");

        Calculator calculator = new Calculator(); //You can not create object of abstract class. Err- 'oops.Calculator' is abstract; cannot be instantiated
        calculator.add(4,5);
        calculator.substract(4,5);
    }

}
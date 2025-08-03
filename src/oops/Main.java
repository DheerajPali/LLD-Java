package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hey welcome to main class !");
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        for (String s : list) {
            if (s.equals("a")) {
                list.remove(s);
            }
        }

        System.out.println("List: " + list);

//        Calculator calculator = new Calculator(); //You can not create object of abstract class. Err- 'oops.Calculator' is abstract; cannot be instantiated
//        calculator.add(4,5);
//        calculator.substract(4,5);
    }

}
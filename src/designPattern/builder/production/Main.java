package designPattern.builder.production;

import designPattern.builder.Basic.StudentHelper;
import designPattern.builder.Basic.StudentValidator;

import javax.xml.validation.Validator;

public class Main {
    public static void main(String[] args) {
        //pre-inner classes
        /*
        Student student = null;

        Student.Builder builder = new Student.Builder(1, "Rohit", 24, 78);
        boolean isValidate = Validation.isValid(builder);
        if(isValidate){
            Student student = new Student(builder);
        }
         */

        //productionised
        //Student.builder(); will return an empty Builder object
        Student student = Student.builder()
                .id(1)
                .name("Dheeraj")
                .age(19)
                .psp(78)
                .build();
        System.out.println(student);

//        Student st1 = new Student(-1,"na",-20,99);
    }

}

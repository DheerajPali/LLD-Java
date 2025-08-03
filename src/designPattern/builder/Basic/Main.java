package designPattern.builder.Basic;

public class Main {
    public static void main(String[] args) {
        StudentHelper studentHelper  = new StudentHelper(1,"",23,81, "1234567890");
        boolean isValid = StudentValidator.validate(studentHelper);
        if(isValid){
            Student st = new Student(studentHelper);
        }
    }
}

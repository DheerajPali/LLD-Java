package designPattern.builder.Basic;

public class StudentValidator {

    public static boolean validate(StudentHelper studentHelper){
        return validateName(studentHelper.getName())
                && validateAge(studentHelper.getAge())
                && validatePhoneNumber(studentHelper.getPhoneNumber());
    }

    public static boolean validateName(String name){
        return !name.isEmpty();
    }

    public static boolean validateAge(int age){
        return age > 18;
    }

    public static boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.length() == 10;
    }
}

package designPattern.builder.Basic;

public class StudentHelper {
    int id;
    String name ;
    int age;
    int psp;
    String phoneNumber;

    public StudentHelper(int id, String name, int age, int psp, String phoneNumber){
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.phoneNumber = phoneNumber;
    }

    public int getId(){
        return  this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getPsp(){
        return this.psp;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

}

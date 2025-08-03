package designPattern.builder.Basic;

public class Student {
     int id;
     String name ;
     int age;
     int psp;
     String phoneNumber;

     public Student(StudentHelper studentHelper){
         this(studentHelper.getId()
                 ,studentHelper.getName()
                 ,studentHelper.getAge()
                 ,studentHelper.getPsp()
                 ,studentHelper.getPhoneNumber());
     }

     public Student(int id, String name, int age, int psp, String phoneNumber){
         this.id = id;
         this.name = name;
         this.age  = age;
         this.psp = psp;
         this.phoneNumber = phoneNumber;
     }
}

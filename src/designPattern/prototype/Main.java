package designPattern.prototype;

public class Main {
    public static void main(String[] args) {
        Student batch1Prototype = new Student();
        batch1Prototype.setBatchName("Batch1");
        batch1Prototype.setBatchId(89);
        batch1Prototype.setInstructorName("Sandeep Mahapatra");
        batch1Prototype.setModule("LLD-Advanced");
        batch1Prototype.setSchedule("MWF");
        batch1Prototype.setBatchPsp(79);
        batch1Prototype.setBatchAttendance(98);

        //Here I'll create a prototype of batch1Prototype using copy method, which will provide all the common values.
        Student dheeraj = batch1Prototype.copy();
        dheeraj.setName("Dheeraj");
        dheeraj.setId(1);
        dheeraj.setPsp(81);
        dheeraj.setContactDetails("1234567890");
        System.out.println("dheeraj - batchId  : " + dheeraj.getBatchId());

        //another student --> Rohit, 2,83,9876543210
        Student rohit = batch1Prototype.copy();
        rohit.setName("Rohit");
        rohit.setId(2);
        rohit.setPsp(83);
        rohit.setContactDetails("9876543210");
        System.out.println("rohit - instructorName : " + rohit.getInstructorName());


        Student batch2Prototype = new Student();
        batch2Prototype.setBatchName("Batch2");
        batch2Prototype.setBatchId(9);
        batch2Prototype.setInstructorName("Naman Bhalla");
        batch2Prototype.setModule("LLD");
        batch2Prototype.setSchedule("TTS");
        batch2Prototype.setBatchPsp(80);
        batch2Prototype.setBatchAttendance(75);

        //add student in batch2
        Student Mohit = batch2Prototype.copy();
        Mohit.setName("Mohit");
        Mohit.setId(1);
        Mohit.setPsp(99);
//        Mohit.set

        Registry<Student> registry = new Registry<>();
        registry.add("Batch1", batch1Prototype);
        registry.add("Batch2", batch2Prototype);

        //Now I can directly call protype from registry, as there are many prototypes so you can choose any of those to copy.
        Student Rajneesh = registry.get("Batch2").copy();
        Rajneesh.setName("Rajneesh");
        Rajneesh.setId(2);
        Rajneesh.setPsp(88);
        Rajneesh.setContactDetails("9993468977");

        System.out.println(Rajneesh.getInstructorName());

    }
}

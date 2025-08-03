package designPattern.builder.practice;

public class PracticeMain {
    public static void main(String[] args) {
        Learner learner = Learner.builder()
                .id(19)
                .name("Rohit")
                .batchName("Sandeep's Batch")
                .gradYear(2023)
                .build();
        System.out.println(learner);
    }
}

package designPattern.builder.practice;

public class Learner {
    int id;
    String name;
    String batchName;
    int gradYear;

    public Learner(int id, String name, String batchName, int gradYear){
        this.id  = id;
        this.name = name;
        this.batchName = batchName;
        this.gradYear = gradYear;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        int id;
        String name;
        String batchName;
        int gradYear;

        public Builder id (int id){
            this.id = id;
            return  this;
        }

        public Builder name (String name){
            this.name = name;
            return  this;
        }

        public Builder batchName (String batchName){
            this.batchName = batchName;
            return this;
        }

        public Builder gradYear (int gradYear){
            this.gradYear = gradYear;
            return  this;
        }

        public void validate(){
            if(name.isEmpty()) throw new InvalidNameException("Please enter your name");
            if(batchName.isEmpty()) throw new InvalidBatchNameException("Please enter your name");
            if(gradYear > 2024) throw new InvalidGradYearException("Your year of graduation must be before 2025");
        }

        public Learner build(){
            validate();
            return new Learner(this.id, this.name,this.batchName, this.gradYear);
        }
    }

    @Override
    public String toString() {
        return "Learner {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", batchName='" + batchName + '\'' +
                ", gradYear=" + gradYear +
                '}';
    }

}

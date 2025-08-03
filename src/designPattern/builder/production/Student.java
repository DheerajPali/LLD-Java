package designPattern.builder.production;

public class Student {
    int id;
    String name;
    int age;
    int psp;

    private Student(int id, String name, int age, int psp){
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        int id;
        String name;
        int age;
        int psp;

        public Builder(){}

        public Builder id(int id){
            this.id =  id;
            return this;
        }
        public Builder name(String name){
            this.name =  name;
            return  this;
        }
        public Builder age(int age){
            this.age =  age;
            return this;
        }

        public Builder psp(int psp){
            this.psp = psp;
            return this;
        }

        public void validate(){
            if(this.age < 18) throw new InvalidAgeException("Age must be at least 18");
            if(this.name.isEmpty()) throw new InvalidNameException("Name is required");
            if(this.psp <= 75) throw new InvalidPspException("Psp must be greater than or equal to 75.");
        }

        public Student build(){
            validate(); // first validate --> if anything goes wrong , it throws exception
            return new Student(this.id, this.name, this.age, this.psp);
        }
    }

    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                ", age=" + age +
                '}';
    }
}


/*
    1. Moved the Builder class as a static inner class inside Student.
    2. Removed all getters from Builder , as it's only for validation , and wont be used anywhere else in code.
    3. Since, we don't have getter and setters, we don't need to put prefix in names like setName,
    only name(..), age(...) will suffies and will make readable code.
    4.Put all the validations inside Builder method with a method called validate()
    5.Created a method called build() -> which would return a Student object post valistaion.
 */
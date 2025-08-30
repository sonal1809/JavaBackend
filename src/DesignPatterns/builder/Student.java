package DesignPatterns.builder;

public class Student {
    String name;
    int age;
    String univName;
    double psp;
    String batch;
    int gradYear;
    String phoneNumber;

    // Enhancement
    // If we want to create an object of student class,
    // somehow student class should give us a way of using builder class
    // As we are trying to create a student object, and when we are calling it from client we need to pass the student object in order to call this function,
    // Hence making this function as static
    public static Builder getBuilder(){
        return new Builder();
    }

    // Private - As we want to restrict the client from directly making student object
    private Student(Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.univName = builder.getUnivName();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.phoneNumber = builder.getPhoneNumber();
    }


    // Inner class
    // Static -> As static method can not call non-static member (line:17), therefore making it static
    public static class Builder {
        String name;
        int age;
        String univName;
        double psp;
        String batch;
        int gradYear;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build(){
            // validation starts
            if(this.getAge() < 18){
                throw new RuntimeException("Age should not be less than 18");
            }
            if(this.getGradYear() > 2023){
                throw new RuntimeException("Grad year should not be more than 2023");
            }
            return new Student(this);
        }
    }
}

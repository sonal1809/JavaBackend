package LLD2.builder;

public class StudentV0 {
    String name;
    int age;
    String univName;
    double psp;
    String batch;
    int gradYear;
    String phoneNumber;

    public StudentV0(StudentBuilder builder){
        // validation starts
        if(builder.getAge() < 18){
            throw new RuntimeException("Age should not be less than 18");
        }
        if(builder.getGradYear() > 2023){
            throw new RuntimeException("Grad year should not be more than 2023");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.univName = builder.getUnivName();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.phoneNumber = builder.getPhoneNumber();
    }
}

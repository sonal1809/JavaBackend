package LLD2.builder;

public class Client {

    public static void main(String[] args) {
        // Basic version
        StudentBuilder builder = new StudentBuilder();
        builder.setName("Sonal");
        builder.setAge(25);
        builder.setBatch("MWF July");
        builder.setPsp(99.0);
        builder.setGradYear(2019);
        builder.setPhoneNumber("7906673035");
        builder.setUnivName("SRM");
        StudentV0 studentV0 = new StudentV0(builder);


        // Optimized
        Student student = Student.getBuilder()
                .setName("Sonal")
                .setAge(25)
                .setGradYear(2024)
                .setPhoneNumber("1234")
                .build();

    }
}

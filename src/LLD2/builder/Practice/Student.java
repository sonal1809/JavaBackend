package LLD2.builder.Practice;


public class Student {
    private int age;
    private String name;
    private String address;

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    private Student(StudentBuilder builder) {
        this.age = builder.getAge();
        this.address = builder.getAddress();
        this.name = builder.getName();
    }

    public static class StudentBuilder{
        private int age;
        private String name;
        private String address;

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        Student build() {
            if(this.age < 18){
                throw new RuntimeException("Illegal age");
            }
            if(this.address != "India"){
                throw new RuntimeException("Bhagg yaha se");
            }
            return new Student(this);
        }
    }


}

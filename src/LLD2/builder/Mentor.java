package LLD2.builder;

public class Mentor {
    private String name;
    private String address;
    private String phoneNo;
    private String age;
    private String exp;


    public static Builder getBuilder(){
        return new Builder();
    }

    public Mentor(Builder builder) {
        this.name = builder.getName();
        this.address = builder.getAddress();
        this.phoneNo = builder.getPhoneNo();
        this.age = builder.getAge();
        this.exp = builder.getExp();
    }

    public static class Builder{
        private String name;
        private String address;
        private String phoneNo;
        private String age;
        private String exp;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public String getAge() {
            return age;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public String getExp() {
            return exp;
        }

        public Builder setExp(String exp) {
            this.exp = exp;
            return this;
        }

        public Mentor build(){
            //Validations
            if(this.exp.equalsIgnoreCase("5")){
                System.out.println("Validated");
            }
            return new Mentor(this);
        }
    }
}

package DesignPatterns.builder.Practice;

public class Employee {
    private int id;
    private long salary;
    private String name;
    private String address;

    Employee(Builder builder){
        this.id = builder.getId();
        this.address = builder.getAddress();
        this.salary = builder.getSalary();
        this.name = builder.getName();
    }

    public static Builder getBuilder(){
        return new Builder();
    }


    private static class Builder{
        private int id;
        private long salary;
        private String name;
        private String address;


        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public long getSalary() {
            return salary;
        }

        public Builder setSalary(long salary) {
            this.salary = salary;
            return this;
        }

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

         Employee build(){
            if(!this.address.equals("India")){
                throw new RuntimeException("Not allowed to work");
            }
            return new Employee(this);
        }
    }
}

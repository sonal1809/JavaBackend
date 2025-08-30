package DesignPatterns.builder;

public class Employee {
    private String name;
    private String empNo;
    private long salary;
    private String address;
    private String phoneNo;

    private static EmployeeBuilder getBuilder(){
        return new EmployeeBuilder();
    }

    private Employee(EmployeeBuilder builder) {
        this.name = builder.getName();
        this.empNo = builder.getEmpNo();
        this.salary = builder.getSalary();
        this.address = builder.getAddress();
        this.phoneNo = builder.getPhoneNo();
    }

    public static class EmployeeBuilder {
        private String name;
        private String empNo;
        private long salary;
        private String address;
        private String phoneNo;

        public String getName() {
            return name;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public long getSalary() {
            return salary;
        }

        public EmployeeBuilder setSalary(long salary) {
            this.salary = salary;
            return this;
        }

        public String getEmpNo() {
            return empNo;
        }

        public EmployeeBuilder setEmpNo(String empNo) {
            this.empNo = empNo;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public EmployeeBuilder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        private Employee build(){
            if(this.getSalary() > 10000){
                System.out.println("Validated");
            }
            return new Employee(this);
        }
    }
}

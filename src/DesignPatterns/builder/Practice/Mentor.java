package DesignPatterns.builder.Practice;

public class Mentor {
    private Long id;
    private Long salary;
    private String name;
    private String address;
    private String expertise;
    private String company;
    private int experience;

    private Mentor(Builder builder){
        this.address = builder.getAddress();
        this.id = builder.getId();
        this.experience = builder.getExperience();
        this.company = builder.getCompany();
        this.name = builder.getName();
        this.salary = builder.getSalary();
        this.expertise = builder.getExpertise();
    }

    public static Builder getBuilder(){
        return new Builder();
    }


    private static class Builder{
        private Long id;
        private Long salary;
        private String name;
        private String address;
        private String expertise;
        private String company;
        private int experience;


        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Long getSalary() {
            return salary;
        }

        public Builder setSalary(Long salary) {
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

        public String getExpertise() {
            return expertise;
        }

        public Builder setExpertise(String expertise) {
            this.expertise = expertise;
            return this;
        }

        public String getCompany() {
            return company;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public int getExperience() {
            return experience;
        }

        public Builder setExperience(int experience) {
            this.experience = experience;
            return this;
        }

        Mentor build(){
            if(this.experience < 5){
                throw  new RuntimeException("Min exp required is 5");
            }
            return new Mentor(this);
        }
    }
}

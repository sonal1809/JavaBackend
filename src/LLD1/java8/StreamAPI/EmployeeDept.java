package LLD1.java8.StreamAPI;

class EmployeeDept {
    private String name;
    private String department;
    private int commits;

    public EmployeeDept(String name, String department, int commits) {
        this.name = name;
        this.department = department;
        this.commits = commits;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getCommits() { return commits; }
}

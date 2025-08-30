package LLD1.Oops.Practice.Immutability;

public class Address {
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() { return city; }
    public String getState() { return state; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
}

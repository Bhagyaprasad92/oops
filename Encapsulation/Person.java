public class Person {
    private String name;
    private long aadhaar;
    public Person() {
        this.name = "Unknown";
        this.aadhaar = -1;
    }
    public Person(String name, long aadhaar) {
        this.name = name;
        this.aadhaar = aadhaar;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAadhaar(long aadhaar) {
        this.aadhaar = aadhaar;
    }
    public long getAadhaar() {
        return aadhaar;
    }
}
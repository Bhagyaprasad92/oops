public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Bhagya Prasad");
        System.out.println(p.getName());
        System.out.println(p.getAadhaar());
        p.setAadhaar(889996236202L);
        System.out.println(p.getAadhaar());
    }
}
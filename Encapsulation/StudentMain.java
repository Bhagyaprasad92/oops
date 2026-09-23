public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Prasad");
        student.setScore(85);

        System.out.println(student.getName() + " scored: " + student.getScore());

        student.setScore(150);
    }
}

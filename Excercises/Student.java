package Excercises;

public class Student {
  
   private String name;
   private int rollNo;
   private double marks;

   // Constructor to initialize name, rollNo, and marks
   public Student(String name, int rollNo, double marks) {
       this.name = name;
       this.rollNo = rollNo;
       this.marks = marks;
   }

   // Method to calculate grade based on marks
   public String calculateGrade() {
       if (marks >= 90) {
           return "A";
       } else if (marks >= 75) {
           return "B";
       } else if (marks >= 60) {
           return "C";
       } else if (marks >= 50) {
           return "D";
       } else {
           return "F";
       }
   }

   // Method to display student information and grade
   public void displayGrade() {
       System.out.println("Student Name: " + name);
       System.out.println("Roll Number: " + rollNo);
       System.out.println("Marks: " + marks);
       System.out.println("Grade: " + calculateGrade());
       System.out.println("----------------------------");
   }

   // Main method to create and display multiple Student instances
   public static void main(String[] args) {
       // Create instances of Student class
       Student student1 = new Student("Geek1", 101, 92.5);
       Student student2 = new Student("Geek2", 102, 78.3);
       Student student3 = new Student("Geek3", 103, 65.0);
       Student student4 = new Student("Geek4", 104, 45.7);

       // Display grades of each student
       student1.displayGrade();
       student2.displayGrade();
       student3.displayGrade();
       student4.displayGrade();
   }
}
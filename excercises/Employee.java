package excercises;

public class Employee {
    private int empId;
    private String empName;
    private int empAge;
    private String dept;

    public Employee(int empId) {
        this.empId = empId;
    }

    public Employee(int empId, String empName) {
        this(empId, empName, 200, "Unknown Deptartment");
    }

    public Employee(int empId, String empName, int empAge, String dept) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.dept = dept;
    }

    public void displayDetails() {
        if (empId > 0)
            System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        if (empAge != 0)
            System.out.println("Employee Age: " + empAge);
        if (dept != null)
            System.out.println("Employee Department: " + dept);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1);
        emp1.displayDetails();

        Employee emp2 = new Employee(2, "Bhagya Prasad");
        emp2.displayDetails();

        Employee emp3 = new Employee(3, "Engineering");
        emp3.displayDetails();

        Employee emp4 = new Employee(4, "Pandu", 21, "CSE");
        emp4.displayDetails();

        Employee emp5 = new Employee(5, "Yaswanth");
        emp5.displayDetails();
    }
}

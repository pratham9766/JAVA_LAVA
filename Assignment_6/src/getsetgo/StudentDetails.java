package getsetgo;
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private double marks;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter Roll No: ");
        s.setRollNo(sc.nextInt());
        sc.nextLine(); // to consume newline

        System.out.print("Enter Name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter Marks: ");
        s.setMarks(sc.nextDouble());

        s.displayDetails();
        sc.close();
    }
}


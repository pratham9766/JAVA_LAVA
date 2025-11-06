package empy;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("---------------------------");
    }
}

class Engineer extends Employee {
    String specialization;

    Engineer(int id, String name, double salary, String specialization) {
        super(id, name, salary);
        this.specialization = specialization;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("---------------------------");
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Manager m1 = new Manager(101, "Rohit", 85000, "HR");
        Engineer e1 = new Engineer(102, "Sneha", 75000, "Software Development");

        System.out.println("--- Manager Details ---");
        m1.displayDetails();

        System.out.println("--- Engineer Details ---");
        e1.displayDetails();
    }
}


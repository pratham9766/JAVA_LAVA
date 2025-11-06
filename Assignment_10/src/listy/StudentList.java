package listy;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        // Adding student names
        students.add("Riya");
        students.add("Aman");
        students.add("Karan");
        students.add("Neha");
        students.add("Tina");

        // Sorting the list alphabetically
        Collections.sort(students);

        // Displaying the sorted list using for-each loop
        System.out.println("Sorted list of student names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}


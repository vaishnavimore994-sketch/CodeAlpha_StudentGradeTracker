import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name;
    int grade;
    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        System.out.println("=== CodeAlpha - Student Grade Tracker ===");
        System.out.println("Student ID: CA/DF1/305354 - Vaishnavi More");
        
        System.out.print("How many student are added? ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i+1) + " name: ");
            String name = sc.nextLine();
            System.out.print(name + " grade/marks: ");
            int grade = sc.nextInt();
            sc.nextLine();
            students.add(new Student(name, grade));
        }
        
        // Calculation
        int total = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
        String topper = "", lowestStudent = "";
        
        for (Student s : students) {
            total += s.grade;
            if (s.grade > highest) { highest = s.grade; topper = s.name; }
            if (s.grade < lowest) { lowest = s.grade; lowestStudent = s.name; }
        }
        
        double average = (double) total / students.size();
        
        // Report
        System.out.println("\n--- SUMMARY REPORT ---");
        for (Student s : students) {
            System.out.println(s.name + " : " + s.grade);
        }
        System.out.println("----------------------");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest + " (" + topper + ")");
        System.out.println("Lowest Score: " + lowest + " (" + lowestStudent + ")");
        
        sc.close();
    }
}
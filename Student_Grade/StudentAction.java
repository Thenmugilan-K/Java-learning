package Student_Grade;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAction {
    Scanner scanner = new Scanner(System.in);

    public void addStudent(ArrayList<Student> studentList) {
        System.out.print("Enter Student Name: ");
        scanner.nextLine(); // Consume any leftover newline
        String name = scanner.nextLine(); // Read full name

        System.out.print("Enter Student Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] subjects = new String[5];
        int[] marks = new int[5];
        int totalMarks = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Subject Name " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine(); // Read full subject name
            System.out.print("Enter Marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            totalMarks += marks[i];
        }

        String percentage = String.format("%.2f", (double) totalMarks / 500 * 100);
        String grade = calculateGrade(Double.parseDouble(percentage));

        Student student = new Student(name, rollNo, subjects, marks, grade);
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudentDetails(ArrayList<Student> studentList) {
        while (true) {
            System.out.println("\nView Student Details");
            System.out.println("1. View all Student Details");
            System.out.println("2. View Student Details By Roll No");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (studentList.isEmpty()) {
                        System.out.println("No student records available.");
                    } else {
                        for (Student student : studentList) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter Student Roll No: ");
                    int rollNo = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    boolean found = false;

                    for (Student student : studentList) {
                        if (student.getRollNo() == rollNo) {
                            System.out.println(student);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with Roll No " + rollNo + " not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }
    }
    private void printStudentDetails(Student student) {
        int totalMarks = 0;
        for (int mark : student.getMarks()) {
            totalMarks += mark;
        }
        double percentage = (double) totalMarks / 500 * 100;

        System.out.println(student);
        System.out.printf("Percentage: %.2f%% | Grade: %s%n", percentage, calculateGrade(percentage));
    }

    private String calculateGrade(double percentage) {
        return (percentage >= 90) ? "A" : (percentage >= 80) ? "B" : (percentage >= 70) ? "C" : (percentage >= 60) ? "D" : (percentage >= 50) ? "E" : "F";
    }

}

package Student_Grade;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentAction studentAction = new StudentAction();
        studentmenu(studentAction);
    }
    public static void studentmenu(StudentAction studentAction){
        ArrayList<Student> studentList = new ArrayList<>();
        while (true) {
            System.out.println("Welcome to Student Menu");
            System.out.println("------------------------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Details");
            System.out.println("3. Exit");
            System.out.println("-------------------------------------------");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 1:
                    studentAction.addStudent(studentList);
                    break;
                case 2:
                    studentAction.viewStudentDetails(studentList);
                    break;
                case 3:
                    return;
                }
            }
        }
}
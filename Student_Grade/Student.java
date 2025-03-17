package Student_Grade;

import java.util.Arrays;

public class Student {
    private String name;
    private int rollNo;
    private String[] subjects;
    private int[] marks;
    private String grade;

    public Student() {
    }
    public Student(String name, int rollNo, String[] subjects, int[] marks, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = subjects;
        this.marks = marks;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String[] getSubjects() {
        return subjects;
    }
    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\n, Roll No: " + rollNo +
                "\n, Subjects: " + Arrays.toString(subjects) +
                "\n, Marks: " + Arrays.toString(marks)+
                "\n, Grade: " + grade;
    }
}

package oopactivity1;

public class Student {

    private String name;
    private String studentId;
    private double grade;

    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name +
                " | ID: " + studentId +
                " | Grade: " + grade);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Juan Dela Cruz", "2026-001", 92.0);

        Student student2 = new Student("Maria Santos", "2026-002", 85.0);

        student2.setGrade(88.5);

        student1.displayInfo();
        student2.displayInfo();
    }
}
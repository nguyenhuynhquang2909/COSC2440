package Week2;

import java.util.Scanner;

public class SchoolSystem {
    private Student[] studentList = new Student[50];
    private int studentCount = 0;
    private Lecturer[] lecturers = new Lecturer[10];
    private int lecturerCount = 0;
    private Project[] projects = new Project[20];

    public void addStudent(Student s) {
        studentList[studentCount++] = s;
    }
    public void addStudent() {
        System.out.println("Enter the name: ");
        Scanner scan = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Week1.Lecturer lecturer1 = new Week1.Lecturer("L001", "Alice", "Lecturer");
        Week1.Lecturer lecturer2 = new Week1.Lecturer("L002", "Bob", "Senior Lecturer");
        Week1.Lecturer lecturer3 = new Week1.Lecturer("L003", "Carol", "Assoc Lecturer");

        Week1.Project p1 = new Week1.Project("AI", 999.9);
        Week1.Project p2 = new Week1.Project("ML", 1234.5);

        // Must display true
        boolean b = lecturer1.leadProject(p1);
        System.out.println(b);

        // Must display false (p1 has a leader already)
        b = lecturer2.leadProject(p1);
        System.out.println(b);

        // Must display false (lecturer1 is leading a project)
        b = lecturer1.leadProject(p2);
        System.out.println(b);

        // Must display lecturer1 as a leader and lecturer2 and lecturer3 as members
        lecturer2.joinProject(p1);
        lecturer3.joinProject(p1);
        p1.displayMembers();
    }


}

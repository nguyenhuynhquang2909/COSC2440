package Week1;

import Week2.Lecturer;

public class SchoolSystem {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("L001", "Alice", "Lecturer");
        Lecturer lecturer2 = new Lecturer("L002", "Bob", "Senior Lecturer");
        Lecturer lecturer3 = new Lecturer("L003", "Carol", "Assoc Lecturer");

        Week2.Project p1 = new Week2.Project("AI", 999.9);
        Week2.Project p2 = new Week2.Project("ML", 1234.5);

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

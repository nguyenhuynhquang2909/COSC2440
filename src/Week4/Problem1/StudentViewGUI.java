package Week4.Problem1;

public class StudentViewGUI extends StudentView {

    @Override
    public void printStudentDetails(String studentId, String name, String major) {
        System.out.println("Student: ");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
    }
}

package Week4.Problem1;

public class Main {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        Student student = new Student();

        StudentViewGUI viewGUI = new StudentViewGUI();
        StudentController controller = new StudentController(student, viewGUI, input);

        controller.updateStudentDetails();
        controller.updateView();
        input.closeScanner();
    }

}

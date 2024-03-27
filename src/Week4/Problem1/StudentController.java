package Week4.Problem1;

public class StudentController {
    private Student model;
    private StudentView view;
    private DataInput dataInput;

    public StudentController(Student model, StudentView view, DataInput dataInput) {
        this.model = model;
        this.view = view;
        this.dataInput = dataInput;
    }
    public void updateStudentDetails() {
        boolean done = false;
        while (!done) {
            String studentId = dataInput.getInput("Enter student ID: ");
            String name = dataInput.getInput("Enter student name: ");
            String major = dataInput.getInput("Enter student major: ");

            model.setStudentId(studentId);
            model.setName(name);
            model.setMajor(major);
            String choice = dataInput.getInput("Do you want to add another student? (Y/N): ");
            if (choice.equalsIgnoreCase("N")) {
                done = true;
            }
        }
    }
    public void updateView() {
        view.printStudentDetails(model.getStudentId(), model.getName(), model.getMajor());
    }
}

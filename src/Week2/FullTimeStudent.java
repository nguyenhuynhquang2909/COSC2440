package Week2;

public class FullTimeStudent extends Student {
    private Project project;
    public FullTimeStudent(String id, String name, String major, Project project) {
        super(id, name, major);
        this.project = project;
    }
    public FullTimeStudent() {
        super();
        this.project = null;
    }

    public FullTimeStudent(String studentId, String fullName, String major) {
        super(studentId, fullName, major);
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }


}

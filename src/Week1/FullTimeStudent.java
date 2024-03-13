package Week1;

public class FullTimeStudent extends Student{
    private Project project;
    public FullTimeStudent(String id, String name, String major, Project project) {
        super(id, name, major);
        this.project = project;
    }
    private boolean registerResearch(Project project) {
        if (project != null) {
            return true;
        }
        return false;
    }
}

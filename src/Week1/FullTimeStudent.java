package Week1;

public class FullTimeStudent extends Student{
    private Research project;
    public FullTimeStudent(String id, String name, String major, Research project) {
        super(id, name, major);
        this.project = project;
    }
    private boolean registerResearch(Research research) {
        if (research != null) {
            return true;
        }
        return false;
    }
}

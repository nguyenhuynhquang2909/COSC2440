package Week3;

public class FullTimeStudent extends Student implements Researcher {
    private Project joinedProject;
    private String researchProfile;
    public FullTimeStudent(String id, String name, String major, Project project) {
        super(id, name, major);
        this.joinedProject = project;
        this.researchProfile = " ";
    }
    public FullTimeStudent() {
        super();
        this.joinedProject = null;
        this.researchProfile = " ";
    }

    public FullTimeStudent(String studentId, String fullName, String major) {
        super(studentId, fullName, major);
    }

    public Project getProject() {
        return joinedProject;
    }

    public void setProject(Project project) {
        this.joinedProject = project;
    }


    @Override
    public boolean joinProject(Project project) {
        if (this.joinedProject == null && project.getMember().contains(this)) {
            this.joinedProject = project;
            project.setMember(this);
            return true;
        }
        return false;
    }

    @Override
    public void setProfile(String profile) {
        this.researchProfile =  "Student(" + profile + ")";
    }

    @Override
    public String getProfile() {
        return this.researchProfile;
    }
}

package Week3;

import java.util.ArrayList;
import java.util.Objects;

public class Lecturer implements Researcher {
    private String employeeId;
    private String fullName;
    private String rank;

    private Project projectLed;

    private ArrayList<Project> joinedProjects;
    // assume the maximum number of projects a lecturer can join at one time is 10
//    private int projectCount = 0;

    public String researchProfile;


    public Lecturer(String id, String name, String rank) {
        this.employeeId = id;
        this.fullName = name;
        this.rank = rank;
        this.joinedProjects = new ArrayList<Project>();
        this.researchProfile = " ";
    }
    public Lecturer() {
        this.employeeId = "Default";
        this.fullName = "Default";
        this.rank = "Default";
        this.researchProfile = " ";
        this.joinedProjects = new ArrayList<Project>();
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRank() {
        return rank;
    }

    public boolean setRank(String rank) {
        String [] rankList = {"Assoc Lecturer" , "Lecturer", "Senior Lecturer"};
        boolean checked = false;
        for (String availableRank: rankList){
            if (availableRank.equals(rank))
                checked = true;
        }
        if (checked){
            this.rank = rank;
            return true;
        }
        return false;
    }
    public boolean leadProject(Project project) {
        if (!isLeadingProject() && project.getLeader() == null) {
            projectLed = project;
            project.assignLeader(this);
            return true;
        }
        return false;
    }
    public boolean joinProject(Project project) {
        if (!project.getMember().contains(this)) {
            this.joinedProjects.add(project);
            project.setMember(this);
            return true;
        }
        return false;
    }
    public boolean isLeadingProject() {
        return projectLed != null;
    }

    public int getProjectCount() {
        return joinedProjects.size();
    }

    public ArrayList<Project> getJoinedProjects() {
        return this.joinedProjects;
    }

    @Override
    public String toString() {
        // String.format() is similar to printf, but it return instead of display
        return String.format("Id: %s, Name: %s, Rank: %s",
                employeeId, fullName, rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Lecturer lecturer = (Lecturer) obj;
        return employeeId.equals(lecturer.employeeId);
    }

    @Override
    public void setProfile(String profile) {
        this.researchProfile = this.researchProfile = "Lecturer(" + profile + ")";
    }

    @Override
    public String getProfile() {
        return this.researchProfile;
    }

    @Override
    public String getId() {
        return employeeId;
    }
}

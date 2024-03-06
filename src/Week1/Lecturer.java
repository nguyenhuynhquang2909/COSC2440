package Week1;

import java.util.ArrayList;

public class Lecturer {
    private String id;
    private String name;
    private String rank;
    private Research leadProject;
    private ArrayList<Research> joinedProject;

    public Lecturer(String name, String rank, Research leadProject, ArrayList<Research> joinedProject) {
        this.name = name;
        this.rank = rank;
        this.leadProject = leadProject;
        this.joinedProject = joinedProject;
    }
    public Lecturer() {
        this.name = "Default";
        this.rank = "As. Lecturer";
        this.leadProject = null;
        this.joinedProject = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public boolean setRank(String rank) {
        String[] rankList = {"As. Lecturer", "Lecturer", "Senior Lecturer"};
        for (String rankEle: rankList) {
            if (this.rank.equals(rankEle)) {
                this.rank = rankEle;
                return true;
            }
        }
        System.out.println("Invalid rank");
        return false;
    }

    public Research getLeadProject() {
        return leadProject;
    }

    public void setLeadProject(Research leadProject) {
        this.leadProject = leadProject;
    }

    public ArrayList<Research> getJoinedProject() {
        return joinedProject;
    }

    public void setJoinedProject(ArrayList<Research> joinedProject) {
        this.joinedProject = joinedProject;
    }

    public boolean joineProject(Research research) {
        if (this.joinedProject.contains(research)) {
            return true;
        }
        return false;
    }
}

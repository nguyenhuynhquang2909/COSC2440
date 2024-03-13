package Week2;

import java.util.ArrayList;
import java.util.Objects;

public class Project {
    private String name;
    private double budget;
    private Object[] members;
    private Lecturer leader;
    private final int MAX_MEMBERS = 10;
    private int memberCount = 0;

    public Project() {
        this.name = "Default";
        this.budget = 0;
        members = new Object[MAX_MEMBERS];
    }
    public Project(String name, double budget) {
        this.name = name;
        this.budget = budget;
        members = new Object[MAX_MEMBERS];
    }

    public void assignLeader(Lecturer leader) {this.leader = leader;};
    public boolean addMember(Object newMember) {
        if (!isNotFull()) {
            return false;
        }
        if (!(newMember instanceof PartTimeStudent)) {

            if (newMember instanceof FullTimeStudent) {
                ((FullTimeStudent) newMember).setProject(this);
                members[memberCount++] = newMember;
            } else {
                ((Lecturer) newMember).getJoinedProjects()[((Lecturer) newMember).getProjectCount()] = this;
                members[memberCount++] = newMember;
            }
        }


        return true;
    }
    public void displayMembers() {
        // display leader
        System.out.println("Leader: " + leader);

        // display regular members
        for(int i = 0; i < memberCount; i++) {
            System.out.printf("Member #%d: " + members[i] + "\n", i + 1);
        }
    }
    public boolean isNotFull() {
        return memberCount != MAX_MEMBERS;
    }

    public String getName() {
        return name;
    }

    public Lecturer getLeader() {
        return leader;
    }
}

package Week3;

import java.util.ArrayList;
import java.util.Set;

public class Project {
    private String name;
    private double budget;
    private ArrayList<Researcher> memberList;
    private Lecturer leader;

    private final int MAX_MEMBERS = 10;
//    private int memberCount = 0;

    public Project() {
        this.name = "Default";
        this.budget = 0;
        memberList = new ArrayList<Researcher>();
    }
    public Project(String name, double budget) {
        this.name = name;
        this.budget = budget;
        memberList = new ArrayList<Researcher>();

    }

    public void assignLeader(Lecturer leader) {this.leader = leader;};
    public boolean addMember(Researcher newMember) {
//        if (!isNotFull()) {
//            return false;
//        }
       if (memberList.contains(newMember)) {
           return false;
       }
       memberList.add(newMember);
       return true;
    }
    public void displayMembers() {
        // display leader
        System.out.println("Leader: " + leader);

        // display regular members
        for(int i = 0; i < memberList.size(); i++) {
            System.out.printf("Member #%d: " + memberList.get(i) + "\n", i + 1);
        }
        System.out.println();
    }
//    public boolean isNotFull() {
//        return memberCount != MAX_MEMBERS;
//    }
    public int getMemberCount() {
        return memberList.size();
    }
    public String getName() {
        return name;
    }

    public Lecturer getLeader() {
        return leader;
    }

    public ArrayList<Researcher> getMember() {
        return memberList;
    }
    public void setMember(Researcher newMember) {
        memberList.add(newMember);
    }
//    public boolean checkLeader(Lecturer leader) {
//        if (leaders.contains(leader))
//    }
}

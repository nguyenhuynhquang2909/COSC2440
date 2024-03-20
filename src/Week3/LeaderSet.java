package Week3;

import java.util.HashSet;
import java.util.Set;

public class LeaderSet {
    private Set<Lecturer> leaders;
    public LeaderSet() {
        this.leaders = new HashSet<>();
    }

    public boolean isLeadingProject(Lecturer leader) {
        return leaders.contains(leader);
    }
    public boolean addLeader(Lecturer leader) {
        return leaders.add(leader);
    }
    public boolean removeLeader(Lecturer leader) {
        return leaders.remove(leader);
    }



}

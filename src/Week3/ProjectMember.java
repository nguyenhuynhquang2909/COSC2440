package Week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectMember {
    private Map<String, List<Project>> memberToProject;
    public ProjectMember() {
        this.memberToProject = new HashMap<String, List<Project>>();
    }
    public List<Project> getAllProjects(Researcher member) {
        return memberToProject.get(member.getId());
    }
    public List<Project> addProjectToMember(Researcher member, Project project) {
        ArrayList<Project> projects = new ArrayList<>();
        projects.add(project);
        List<Project> preProjects = memberToProject.put(member.getId(), projects);
        if (preProjects == null) {
            return null;
        } else {
            for (Project p: projects) {
                if (p.equals(project)) {
                    return preProjects;
                }
            }
            preProjects.add(project);
            return memberToProject.replace(member.getId(), preProjects);
        }
    }
    public boolean removeProjectForMembers(Researcher member, Project project) {
        boolean isDoing = false;
        List<Project> projects = getAllProjects(member);
        if (project != null) {
            isDoing = projects.remove(project);
            memberToProject.replace(member.getId(), projects);
        }
        return isDoing;
    }
}

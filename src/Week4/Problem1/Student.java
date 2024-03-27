package Week4.Problem1;

public class Student {
    private String studentId;
    private String name;
    private String major;
    public Student() {
        this.studentId = "Default";
        this.name = "Default";
        this.major = "Default";
    }

    public Student(String studentId, String name, String major) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

package Week2;

public class Student {
    private String studentId;
    private String fullName;
    private String major;

    public Student(String studentId, String fullName, String major) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.major = major;
    }

    public  Student() {
        this.studentId = "Default";
        this.fullName = "Default";
        this.major = "Default";
    }

    public String getStudentId() {
        return studentId;
    }


    public String getFullName() {
        return fullName;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}

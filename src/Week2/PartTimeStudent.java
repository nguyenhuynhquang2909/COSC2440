package Week2;

public class PartTimeStudent extends Student {
    private double minHours;
    private double maxHours;
    private static int studentCount;

    public PartTimeStudent(String id, String name, String major, int minHours, int maxHours) {
        super(id, name, major);
        this.minHours = minHours;
        this.maxHours = maxHours;
        PartTimeStudent.studentCount++;
    }
    public PartTimeStudent() {
        super();
        this.minHours = 0;
        this.maxHours = 0;
    }
    public static int getCount() {
        return studentCount;
    }

    public PartTimeStudent(String studentId, String fullName, String major) {
        super(studentId, fullName, major);
    }

    public double getMinHours() {
        return minHours;
    }

    public void setMinHours(double minHours) {
        this.minHours = minHours;
    }

    public double getMaxHours() {
        return maxHours;
    }

    public void setMaxHours(double maxHours) {
        this.maxHours = maxHours;
    }

    @Override
    public String toString() {
        return "PartTimeStudent{" +
                "minHours=" + minHours +
                ", maxHours=" + maxHours +
                "} " + super.toString();
    }

    public static int count() {
        return studentCount;
    }
}

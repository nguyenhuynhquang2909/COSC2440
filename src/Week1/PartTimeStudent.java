package Week1;

public class PartTimeStudent extends Student{
    private double minHours;
    private double maxHours;
    private int studentCount;

    public PartTimeStudent(String id, String name, String major, int minHours, int maxHours) {
        super(id, name, major);
        this.minHours = minHours;
        this.maxHours = maxHours;
        studentCount++;
    }
    public void registerHour(double minHours, double maxHours) {
        this.minHours = minHours;
        this.maxHours = maxHours;
    }
    public int count() {
        return studentCount;
    }
}

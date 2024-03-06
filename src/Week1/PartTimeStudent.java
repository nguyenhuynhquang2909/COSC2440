package Week1;

public class PartTimeStudent extends Student{
    private int minHours;
    private int maxHours;

    public PartTimeStudent(String id, String name, String major, int minHours, int maxHours) {
        super(id, name, major);
        this.minHours = minHours;
        this.maxHours = maxHours;
    }
    public void registerHour(int minHours, int maxHours) {
        this.minHours = minHours;
        this.maxHours = maxHours;
    }
}

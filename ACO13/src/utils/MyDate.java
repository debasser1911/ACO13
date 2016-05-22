package utils;

/**
 * Created by DeBasser on 22.05.2016.
 */
public class MyDate {
    private int yearBirth;
    private int monthBirth;
    private int dayBirth;

    public MyDate(int yearBirth, int monthBirth, int dayBirth) {
        this.yearBirth = yearBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
    }

    public String asString() {
        return String.format("%d.%d.%d", dayBirth, monthBirth, yearBirth);
    }

    @Override
    public String toString() {
        return  dayBirth + "." + monthBirth + "." + yearBirth;
    }
}

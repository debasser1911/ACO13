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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyDate myDate = (MyDate) o;

        if (yearBirth != myDate.yearBirth) return false;
        if (monthBirth != myDate.monthBirth) return false;
        return dayBirth == myDate.dayBirth;

    }

}

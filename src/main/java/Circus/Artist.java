package main.java.Circus;

import java.util.ArrayList;

/**
 * Created by istomina on 22.06.2016.
 */
public class Artist {
    protected String name;
    protected String workPlace;
    protected int workCount;
    protected int drinkCount;
    protected double salary;
    ArrayList<Artist> artists;

    public Artist() {
        this.artists = new ArrayList<Artist>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", workCount=" + workCount +
                ", drinkCount=" + drinkCount +
                ", salary=" + salary +
                '}';
    }
}

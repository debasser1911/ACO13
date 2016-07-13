package design_patterns.adapter;

/**
 * Created by DeBasser on 25.06.2016.
 */
public class PolicemanAdapter {

    Militioner militioner;

    public PolicemanAdapter(Militioner militioner) {
        this.militioner = militioner;
    }


    public void serve() {
        militioner.takeBribes();
    }
}


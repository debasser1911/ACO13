package design_patterns.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DeBasser on 25.06.2016.
 */
public class PoliceDepartament {
    private List<Policeman> policemen;

    public PoliceDepartament() {
        policemen = new ArrayList<>();
    }

    public boolean addPoliceman(Policeman policeman) {
        return policemen.add(policeman);

    }

    public void startWorkingDay() {
        for (Policeman policeman : policemen) {
            policeman.serve();
        }
    }
}

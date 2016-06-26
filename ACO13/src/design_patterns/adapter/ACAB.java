package design_patterns.adapter;

/**
 * Created by DeBasser on 25.06.2016.
 */
public class ACAB {
    public static void main(String[] args) {
        PoliceDepartament pd = new PoliceDepartament();

        pd.addPoliceman(new Policeman());
        pd.addPoliceman(new Policeman());
        pd.addPoliceman(new Policeman());
        pd.addPoliceman(new Policeman());
        pd.addPoliceman(new Policeman());
    }
}

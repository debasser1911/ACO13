package design_patterns.builder;

/**
 * Created by DeBasser on 25.06.2016.
 */
public class NutritionFacts {
    private String name;
    private int calories;
    private int fats;
    private int proteins;
    private int vitamins;


    public static class Builder {
        private String name;
        private int calories;
        private int fats;
        private int proteins;
        private int vitamins;

        public Builder addName(String name) {
            this.name = name;
            return this;
        }

        public Builder addCalories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder addfats(int fats) {
            this.fats = fats;
            return this;
        }

        public Builder addproteins(int proteins) {
            this.proteins = proteins;
            return this;
        }

        public Builder addvitamins(int vitamins) {
            this.vitamins = vitamins;
            return this;
        }

/*        public NutritionFacts build() {
            return new NutritionFacts(this);
        }*/

    }

    public NutritionFacts(String name, int calories, int fats) {
        this.name = name;
        this.calories = calories;
        this.fats = fats;
    }
}

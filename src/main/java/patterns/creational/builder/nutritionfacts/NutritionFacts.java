package patterns.creational.builder.nutritionfacts;

public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.calories;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
        isNegative(servingSize, servings, calories, fat, sodium, carbohydrate);
    }

    public static class Builder {

        // required parameters
        private final int servingSize;
        private final int servings;

        // optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            this.calories = val;
            return this;
        }

        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            NutritionFacts nutritionFacts = new NutritionFacts(this);
            return nutritionFacts;
        }

    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }


    // class invariant
    public static boolean isNegative(final int... value) {
        for (int i=0; i< value.length; i++){
            if (value[i] < 0) throw new IllegalArgumentException("invalid value " + value[i]);
        }
        return true;
    }


    public static void main(String[] args){
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(5).carbohydrate(-27).build();
        System.out.println(cocaCola);
    }

}

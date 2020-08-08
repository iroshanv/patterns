package patterns.creational.builder.hierarchicalbuilder;

public class Calzone extends Pizza {

    private Calzone(CalzBuilder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    private boolean sauceInside = false; // default;

    public static class CalzBuilder extends Pizza.Builder<CalzBuilder> {
        private boolean sauceInside = false;

        public CalzBuilder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override Calzone build() {
            return new Calzone(this);
        }

        @Override protected CalzBuilder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        return String.format("Calzone with %s and sauce on the %s",
                toppings, sauceInside ? "inside" : "outside");
    }
}

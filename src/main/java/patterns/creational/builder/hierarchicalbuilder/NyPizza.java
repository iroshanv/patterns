package patterns.creational.builder.hierarchicalbuilder;

import java.util.Objects;

// concrete subclass of Pizza
public class NyPizza extends Pizza {

    public enum Size {SMALL, MEDIUM, LARGE};
    private final Size size;

    NyPizza(NyBuilder builder) {
        super(builder);
        size = builder.size;
    }

    public static class NyBuilder extends Pizza.Builder<NyBuilder> {
        private final Size size;

        public NyBuilder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected NyBuilder self() {
            return this;
        }
    }


    @Override public String toString() {
        return "New york Pizza " + toppings;
    }
}

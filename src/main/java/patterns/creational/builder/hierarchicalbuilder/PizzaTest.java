package patterns.creational.builder.hierarchicalbuilder;

import org.testng.annotations.Test;

public class PizzaTest {

    @Test
    public void nyPizza(){
        NyPizza pizza = new NyPizza.NyBuilder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();

        System.out.println(pizza);
    }

    @Test
    public void calZonePizza() {
        Calzone calzone = new Calzone.CalzBuilder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();
        System.out.println(calzone);
    }


}

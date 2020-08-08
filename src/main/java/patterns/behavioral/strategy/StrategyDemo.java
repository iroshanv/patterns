package patterns.behavioral.strategy;

import org.testng.annotations.Test;

public class StrategyDemo {

    @Test
    public void strategyDemo() {

        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/12/20");
        amexCard.setCvv("123");

        System.out.println("Is Amex Valid " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());
        amexCard2.setNumber("37918588346428325");
        amexCard2.setDate("04/12/20");
        amexCard2.setCvv("123");

        System.out.println("Is Amex Valid " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy ());
        visaCard.setNumber("4539589763663402");
        visaCard.setDate("04/12/20");
        visaCard.setCvv("123");

        System.out.println("Is Amex Valid " + visaCard.isValid());

    }
}

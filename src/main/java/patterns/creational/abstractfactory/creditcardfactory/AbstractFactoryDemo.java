package patterns.creational.abstractfactory.creditcardfactory;

import org.testng.annotations.Test;
import patterns.creational.abstractfactory.creditcardfactory.creditcard.CardType;
import patterns.creational.abstractfactory.creditcardfactory.creditcard.CreditCard;
import patterns.creational.abstractfactory.creditcardfactory.creditcard.CreditCardFactory;

public class AbstractFactoryDemo {

    @Test
    public void abstractFactoryDemo() {

        CreditCardFactory abstractFactory = CreditCardFactory
                .getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());


    }
}

package patterns.creational.abstractfactory.creditcardfactory.visa;

import patterns.creational.abstractfactory.creditcardfactory.creditcard.CardType;
import patterns.creational.abstractfactory.creditcardfactory.creditcard.CreditCard;
import patterns.creational.abstractfactory.creditcardfactory.creditcard.CreditCardFactory;
import patterns.creational.abstractfactory.creditcardfactory.creditcard.Validator;

public class VisaFactory extends CreditCardFactory {


    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD: {
                return new VisaGoldCreditCard();
            }
            case PLATINUM: {
                return new VisaBlackCreditCard();
            }
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {

        switch (cardType) {
            case GOLD: {return new VisaGoldValidator();}
            case PLATINUM: {return new VisaBlackValidator();}
        }

        return null;
    }
}

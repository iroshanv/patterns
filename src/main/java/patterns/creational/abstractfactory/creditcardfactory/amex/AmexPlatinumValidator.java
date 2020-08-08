package patterns.creational.abstractfactory.creditcardfactory.amex;

import patterns.creational.abstractfactory.creditcardfactory.creditcard.CreditCard;
import patterns.creational.abstractfactory.creditcardfactory.creditcard.Validator;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}

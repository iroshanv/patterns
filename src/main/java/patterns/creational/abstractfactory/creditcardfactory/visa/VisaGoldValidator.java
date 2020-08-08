package patterns.creational.abstractfactory.creditcardfactory.visa;


import patterns.creational.abstractfactory.creditcardfactory.creditcard.CreditCard;
import patterns.creational.abstractfactory.creditcardfactory.creditcard.Validator;

public class VisaGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}

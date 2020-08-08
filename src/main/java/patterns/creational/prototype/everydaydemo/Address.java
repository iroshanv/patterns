package patterns.creational.prototype.everydaydemo;

public class Address {

    private String street;
    private String pinCode;

    public Address(String street, String pinCode) {
        this.street = street;
        this.pinCode = pinCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}

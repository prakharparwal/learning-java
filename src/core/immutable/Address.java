package core.immutable;

public class Address {
    private int houseNumber;
    private String streetAddress;

    public Address(int houseNumber, String streetAddress) {
        this.houseNumber = houseNumber;
        this.streetAddress = streetAddress;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
}

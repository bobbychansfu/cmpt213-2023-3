package ca.sfu.cmpt.person;

public class Address {
    String street;
    int number;
    String city;

    public Address(String s, int n, String c) {
        street = s;
        number = n;
        city = c;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
}

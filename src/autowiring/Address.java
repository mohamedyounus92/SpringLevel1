/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autowiring;

/**
 *
 * @author md_yo
 */
public class Address {
    
    private String street;
    private String city;
    private String pincode;
    
    public Address()
    {}

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the pincode
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * @param pincode the pincode to set
     */
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    
    public void display()
    {
        System.out.println("Street: " + this.getStreet());
        System.out.println("City: " + this.getCity());
        System.out.println("Pincode:" + this.getPincode());
    }
}

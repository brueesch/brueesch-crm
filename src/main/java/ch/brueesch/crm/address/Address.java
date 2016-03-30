package ch.brueesch.crm.address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String street;

    private String secondStreet;

    private String zip;

    private String city;

    private String country;


    public Address() {
    }

    public Long getId() {
        return id;
    }

    public Address setId(Long id) {
        this.id = id;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getSecondStreet() {
        return secondStreet;
    }

    public Address setSecondStreet(String secondStreet) {
        this.secondStreet = secondStreet;
        return this;
    }

    public String getZip() {
        return zip;
    }

    public Address setZip(String zip) {
        this.zip = zip;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }
}

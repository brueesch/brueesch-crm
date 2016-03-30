package ch.brueesch.crm.contact;

import ch.brueesch.crm.company.Company;
import ch.brueesch.crm.address.Address;
import ch.brueesch.crm.util.ContactSalutation;
import ch.brueesch.crm.util.Note;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contact {


    @Id
    @GeneratedValue
    private Long id;

    private ContactSalutation contactSalutation;

    private String firstName;

    private String lastName;

    private String function;

    private String eMail;

    @ManyToOne
    private Address address;

    private String phoneNumber;

    private String mobileNumber;

    @OneToMany
    private List<Note> notes;

    @ManyToOne
    private Company company;

    public Contact() {
    }

    public Long getId() {
        return id;
    }

    public Contact setId(Long id) {
        this.id = id;
        return this;
    }

    public ContactSalutation getContactSalutation() {
        return contactSalutation;
    }

    public Contact setContactSalutation(ContactSalutation contactSalutation) {
        this.contactSalutation = contactSalutation;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Contact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFunction() {
        return function;
    }

    public Contact setFunction(String function) {
        this.function = function;
        return this;
    }

    public String geteMail() {
        return eMail;
    }

    public Contact seteMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Contact setAddress(Address address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contact setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Contact setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public Contact setNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public Contact setCompany(Company company) {
        this.company = company;
        return this;
    }
}

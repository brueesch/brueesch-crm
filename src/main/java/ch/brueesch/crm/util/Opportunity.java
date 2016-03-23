package ch.brueesch.crm.util;

import ch.brueesch.crm.company.Company;
import ch.brueesch.crm.contact.Contact;
import ch.brueesch.crm.user.User;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

public class Opportunity {

    @Id
    @GeneratedValue
    private Long id;

    private Company client;

    private String description;

    private Contact contact;

    private OpportunityImportance opportunityImportance;

    private String chance;

    private LocalDate decisionDate;

    private User asignee;

    private List<Note> note;

    private OpportunityStatus status;


    public Opportunity() {
    }

    public Long getId() {
        return id;
    }

    public Opportunity setId(Long id) {
        this.id = id;
        return this;
    }

    public Company getClient() {
        return client;
    }

    public Opportunity setClient(Company client) {
        this.client = client;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Opportunity setDescription(String description) {
        this.description = description;
        return this;
    }

    public Contact getContact() {
        return contact;
    }

    public Opportunity setContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public OpportunityImportance getOpportunityImportance() {
        return opportunityImportance;
    }

    public Opportunity setOpportunityImportance(OpportunityImportance opportunityImportance) {
        this.opportunityImportance = opportunityImportance;
        return this;
    }

    public String getChance() {
        return chance;
    }

    public Opportunity setChance(String chance) {
        this.chance = chance;
        return this;
    }

    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    public Opportunity setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
        return this;
    }

    public User getAsignee() {
        return asignee;
    }

    public Opportunity setAsignee(User asignee) {
        this.asignee = asignee;
        return this;
    }

    public List<Note> getNote() {
        return note;
    }

    public Opportunity setNote(List<Note> note) {
        this.note = note;
        return this;
    }

    public OpportunityStatus getStatus() {
        return status;
    }

    public Opportunity setStatus(OpportunityStatus status) {
        this.status = status;
        return this;
    }
}

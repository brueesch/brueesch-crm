package ch.brueesch.crm.opportunity;

import ch.brueesch.crm.company.Company;
import ch.brueesch.crm.contact.Contact;
import ch.brueesch.crm.user.User;
import ch.brueesch.crm.util.Note;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Opportunity {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Company client;

    private String description;

    @OneToOne
    private Contact contact;

    private OpportunityImportance opportunityImportance;

    private String chance;

    private LocalDate decisionDate;

    @OneToOne
    private User assignee;

    @OneToMany
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

    public User getAssignee() {
        return assignee;
    }

    public Opportunity setAssignee(User assignee) {
        this.assignee = assignee;
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

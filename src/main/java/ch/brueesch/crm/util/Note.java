package ch.brueesch.crm.util;

import ch.brueesch.crm.user.User;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Note {

    @Id
    @GeneratedValue
    private Long id;

    private String text;

    private LocalDate date;

    @ManyToOne
    private User user;

    public Note() {
    }

    public Long getId() {
        return id;
    }

    public Note setId(Long id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public Note setText(String text) {
        this.text = text;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Note setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Note setUser(User user) {
        this.user = user;
        return this;
    }
}

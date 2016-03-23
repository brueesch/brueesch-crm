package ch.brueesch.crm.util;

public enum ContactSalutation {

    HERR("Herr"),
    FRAU("Frau"),
    HERRDR("Herr Dr."),
    FRAUDR("Frau Dr."),
    PROF("Prof."),
    PROFDR("Prof. Dr.");

    private final String description;

    private ContactSalutation(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

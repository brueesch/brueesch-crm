package ch.brueesch.crm.util;

public enum OpportunityImportance {
    HIGH("High"),
    MEDIUM("Medium"),
    LOW("Low");

    private final String description;

    private OpportunityImportance(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

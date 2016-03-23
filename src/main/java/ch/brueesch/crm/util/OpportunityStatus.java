package ch.brueesch.crm.util;

public enum OpportunityStatus {

    OFFER("Offer"),
    IDENTIFIED("Identified"),
    WON("Won"),
    LOST("Lost"),
    CANCELED("Canceled");

    private final String description;

    private OpportunityStatus(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

}

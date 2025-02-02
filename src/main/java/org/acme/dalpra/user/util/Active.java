package org.acme.dalpra.user.util;

public enum Active {
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    PENDING("Pending"); // Example of another possible state

    private final String statusLabel;

    Active(String statusLabel) {
        this.statusLabel = statusLabel;
    }

    public String getStatusLabel() {
        return statusLabel;
    }

    @Override
    public String toString() {
        return statusLabel; // Override toString() for cleaner output
    }
}

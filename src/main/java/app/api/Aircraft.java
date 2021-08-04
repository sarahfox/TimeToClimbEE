package app.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Aircraft {
    private String tailNumber;

    public Aircraft() {
        // Jackson deserialization
    }

    public Aircraft(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    @JsonProperty
    public String getTailNumber() {
        return tailNumber;
    }
}

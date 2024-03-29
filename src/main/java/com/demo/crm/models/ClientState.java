package com.demo.crm.models;

// Sorte de constructeur
public enum ClientState {
    ACTIVE(0, "ACTIVE"),
    INACTIVE(1, "INACTIVE");

    private final int value;
    private final String label;

    ClientState(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static ClientState fromValue(int value) {
        for (ClientState state : ClientState.values()) {
            if (state.value == value) {
                return state;
            }
        }
        throw new IllegalArgumentException("Invalid client state value: " + value);
    }
}
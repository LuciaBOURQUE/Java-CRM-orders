package com.demo.crm.models;


public enum PrestationState {
    CANCELED(0, "CANCELED"),
    OPTION(1,"OPTION"),
    CONFIRMED(2, "CONFIRMED");

    private final int value;
    private final String label;

    PrestationState(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static PrestationState fromValue(int value) {
        for (PrestationState state : PrestationState.values()) {
            if (state.value == value) {
                return state;
            }
        }
        throw new IllegalArgumentException("Invalid prestation state value: " + value);
    }
}
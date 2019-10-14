package com.alessandro.calimero.utils.config.parts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class DeviceConfiguration {

    @JsonProperty("label")
    private String label;

    @JsonProperty("groupAddresses")
    private ArrayList<GroupAddress> groupAddresses = new ArrayList<>();

    public DeviceConfiguration() {
    }

    public String getLabel() {
        return label;
    }

    public ArrayList<GroupAddress> getGroupAddresses() {
        return groupAddresses;
    }
}

package com.github.andreaTP.opa.chicory.testcases;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Testcases {
    @JsonProperty("cases")
    private Case[] cases;

    Testcases() {}

    public Case[] cases() {
        return cases;
    }
}

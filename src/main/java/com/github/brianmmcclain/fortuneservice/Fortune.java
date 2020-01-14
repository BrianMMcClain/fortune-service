package com.github.brianmmcclain.fortuneservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fortune {

    @Id
    private final Long id;
    private final String text;

    public Fortune() {
        this.id = 0L;
        this.text = "No Fortune";
    }

    public Fortune(long id, String text) {
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }
}
package com.github.brianmmcclain.fortuneservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fortune {

    @Id
    private Long id;
    private String text;

    @Override
    public String toString() {
        return this.text;
    }
}
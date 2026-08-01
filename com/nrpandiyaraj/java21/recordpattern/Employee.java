package com.nrpandiyaraj.java21.recordpattern;

public record Employee(String name, int id) {

    public Employee(String name) {
        this(name, 0);
    }
}

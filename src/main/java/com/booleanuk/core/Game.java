package com.booleanuk.core;

public class Game {
    private String name;

    public String getName() {
        return name;
    }

    public Game(String name) {
        this.name = name;
    }

    public String start() {
        return "Playing " + this.name;
    }
}

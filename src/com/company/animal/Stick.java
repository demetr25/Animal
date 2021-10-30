package com.company.animal;

public class Stick {

    private int length;
    private int health = 100;

    public Stick(int length, int health) {
        this.length = length;
        this.health = health;
    }

    public int getLength() {
        return length;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

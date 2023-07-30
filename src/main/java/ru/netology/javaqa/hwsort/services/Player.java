package ru.netology.javaqa.hwsort.services;
public class Player {
    private int id;
    private String name;
    private int strength;

    public Player(int id, String name, int strength) { // конструктор
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}

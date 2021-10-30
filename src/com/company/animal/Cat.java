package com.company.animal;

public class Cat extends Animal implements Playable {

    private String color;

    public Cat(String name, int age, char gender, String color) {
        super(name, age, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    @Override
    public void play(String toy) {
        System.out.println("Кошак чилит с "+toy);
        run();
        voice();
        System.out.println("Кошак рад!");
    }

    @Override
    public void play() {
        System.out.println("Кошак портит имущество");
        run();
        voice();
        System.out.println("Кошак рад!");
    }
}

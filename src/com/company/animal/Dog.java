package com.company.animal;

public class Dog extends Animal implements Playable, StickReturner{

    private boolean isSmart;

    public Dog(String name, int age, char gender, boolean isSmart) {
        super(name, age, gender);
        this.isSmart = isSmart;
    }

    public boolean isSmart() {
        return isSmart;
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
    }

    @Override
    public void play(String toy) {
        System.out.println("Пес чилит с "+toy);
        run();
        voice();
        System.out.println("Пес доволен");
    }

    @Override
    public void play() {
        System.out.println("Пес портит имущество");
        run();
        voice();
        System.out.println("Пес доволен");
    }


    @Override
    public Stick returnStick(Stick stick) {
        run();
        voice();
        System.out.println("Хватает палку");
        stick.setHealth(stick.getHealth()-20);
        System.out.println("Пес несет палку");
        return stick;
    }
}

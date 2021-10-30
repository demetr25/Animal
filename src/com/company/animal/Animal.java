package com.company.animal;

public abstract class Animal {

    private String name;
    private int age;
    private char gender = 'M';

    public Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void run(){
        System.out.println(name+" бегает");
    }

    public abstract void voice();
}

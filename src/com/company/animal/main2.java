package com.company.animal;

public class main2 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Tom", 2, 'M', "gray"),
                new Dog("Dick", 3, 'M', true),
                new Cat("Barsik", 2, 'M', "gray"),
                new Dog("vlaDick", 3, 'M', true),
        };
        Playable[] playables = new Playable[animals.length];
        for (int i = 0; i < playables.length; i++) {
            playables[i]=(Playable)animals[i];
        }
        massPlay(playables, "мячик");
    }

    private static void massPlay(Playable[] players, String toy) {
        for (Playable player : players) {
            player.play(toy);
        }
    }
}

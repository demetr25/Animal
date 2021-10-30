package com.company.animal;

public class main {

    public static void main(String[] args) {
        var tom = new Cat("Tom", 1, 'M', "white");
        var sharick = new Dog("Sharick", 3, 'M', true);

        System.out.println("1. voice");
        tom.voice();
        sharick.voice();
        System.out.println("=".repeat(80));

        System.out.println("2. play");
        tom.play();
        sharick.play();
        tom.play("крыса");
        System.out.println("-".repeat(80));
        sharick.play("Том");
        System.out.println("=".repeat(80));

        System.out.println("3. stick");
        var druchok = new Stick(70, 100);
        sharick.returnStick(druchok);
        System.out.println(druchok.getHealth());

        System.out.println("-".repeat(80));

        Stick sameDruchok2 = sharick.returnStick(druchok);
        System.out.println(sameDruchok2.getHealth());

        System.out.println("=".repeat(80));
    }
}

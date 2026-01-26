package task4;

import task4.Creature.Cow;
import task4.Creature.move.Fly;
import task4.Creature.sound.Meow;


public class task4 {
    public static void main(String[] args) {
    Cow flyingMeowingCow = new Cow(new Fly(), new Meow());
    flyingMeowingCow.howDoIMove();
    flyingMeowingCow.howDoISound();
    flyingMeowingCow.giveMilk();
    }
}

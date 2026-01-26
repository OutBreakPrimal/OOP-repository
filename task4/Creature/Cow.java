package task4.Creature;

import task4.Creature.move.MoveLogic;
import task4.Creature.sound.SoundLogic;

public class Cow extends Creature {
    public Cow(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }
    @Override
    public String getName() {
        return "Cow";
    }
    public void giveMilk() {
        System.out.println(getName() + " gives milk.");
    }
}

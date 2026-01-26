package task4.Creature;

import task4.Creature.move.MoveLogic;
import task4.Creature.sound.SoundLogic;

public class Cat extends Creature {
    public Cat(MoveLogic moveLogic, SoundLogic soundLogic) {
    super(moveLogic, soundLogic);
}
@Override
    public String getName() {
    return "Cat";
}
    public void catchMice() {
        System.out.println(getName() + " catches mice.");
    }
}

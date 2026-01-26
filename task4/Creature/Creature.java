package task4.Creature;

import task4.Creature.move.MoveLogic;
import task4.Creature.sound.SoundLogic;

abstract class Creature {
    MoveLogic moveLogic;
    SoundLogic soundLogic;
    public Creature(MoveLogic moveLogic, SoundLogic soundLogic) {
        this.moveLogic = moveLogic;
        this.soundLogic = soundLogic;
    }
    public abstract String getName();

    public void howDoIMove() {
        moveLogic.move(getName());
    }
    public void howDoISound() {
        soundLogic.sound(getName());
    }
}

package task4.Creature;

import task4.Creature.move.MoveLogic;
import task4.Creature.sound.SoundLogic;

public class Human extends Creature {
        public Human(MoveLogic moveLogic, SoundLogic soundLogic) {
            super(moveLogic, soundLogic);
        }

        @Override
        public String getName() {
            return "Person";
        }

        public void searchMeaningOfLife() {
            System.out.println(getName() + " is looking for the meaning of life.");
        }
    }


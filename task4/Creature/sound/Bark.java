package task4.Creature.sound;

public class Bark implements SoundLogic {
    @Override
    public void sound(String name) {
        System.out.println(name + "Barks.");
    }
}

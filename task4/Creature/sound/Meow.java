package task4.Creature.sound;

public class Meow implements SoundLogic {
    @Override
    public void sound(String name) {
        System.out.println(name + "Meows");
    }
}

package task4.Creature.move;

public class Fly implements MoveLogic {
    @Override
    public void move(String name) {
        System.out.println(name + "Flapping it's wings.");
    };
}

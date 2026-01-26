package task4.Creature.move;

public class Swim implements MoveLogic {
    @Override
    public void move(String name) {
        System.out.println(name + "Swims.");
    }
}

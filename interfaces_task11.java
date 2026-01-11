public class interfaces_task11 {
    public static void main(String[] args) {
    }
    public interface Movable {
        void move();
    }
    public interface Edible {
        void beEaten();
    }
    public interface Eat {
        void eat();
    }
    class Mouse  implements Movable, Edible {
        public void move() {};
        public void beEaten() {};
    }
    class Cat  implements Edible, Eat, Movable {
        public void eat() {};
        public void beEaten() {};
        public void move() {};
    }
    class Dog  implements Eat, Movable {
        public void eat() {};
        public void move() {};
    }
}

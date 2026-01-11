public class Interfaces_task2 {
    interface canFly {
        void fly();
    }
    interface canMove {
        void move();
    }
    interface canEat {
        void eat();
    }
    class Dog implements canEat, canMove {
        public void eat() {};
        public void move() {};
    }
    class Car implements canMove {
        public void move() {};
    }
    class Duck  implements canEat, canMove, canFly {
        public void eat() {};
        public void move() {};
        public void fly() {};
    }
    class plane  implements canMove, canFly {
        public void move() {};
        public void fly() {};
    }
}

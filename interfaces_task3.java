public class interfaces_task3 {
    public static void main(String[] args) {

    }
    interface canFly {
        public void fly();
    }
    interface canRun {
        public void run();
    }
    interface canSwim {
        public void swim();
    }
    public class Human implements canRun, canSwim {
        public void swim() {};
        public void run() {};
    }
    public class Duck  implements canRun, canSwim, canFly {
        public void swim() {};
        public void run() {};
        public void fly() {};
    }
    public class Penguin implements canRun, canSwim {
        public void swim() {};
        public void run() {};
    }
    public class Airplane implements canFly {
        public void fly() {};
    }
}


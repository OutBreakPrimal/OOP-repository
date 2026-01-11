public class interfaces_task4 {
    interface canRun {
        public void run();
    }
    interface canSwim {
        public void swim();
    }
    public abstract class Human implements canRun, canSwim {}
}

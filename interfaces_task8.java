public class interfaces_task8 {
    public static void main(String[] args) throws Exception {
        interface Person {
            boolean havePulse = true;
            public boolean isAlive();
        }
        interface Presentable extends Person {
            public boolean isAlive();
        }
    }
}

public class interfaces_task9 {
    public static void main(String[] args) {
        interface canMove {
            public Double speed();
        }
        interface canFly extends canMove {
            public Double speed();
        }
    }
}

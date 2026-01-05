public class OOP_part2_task5 {
    public static class Building {
        private String type;
        public void initialize(String type) {
            this.type = type;
        }

        public static void main(String[] args) {
            Building building = new Building();
            building.initialize("Restaurant");
            building.initialize("Barbershop");
        }
    }
}

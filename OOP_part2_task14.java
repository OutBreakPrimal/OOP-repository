public class OOP_part2_task14 {
    public class Solution {
        public static void showWeather(City city) {
            System.out.println("In the city" + city.getName() + "today the air temperature is: " + city.getTemperature());
        }

        public static void main(String[] args) {
            City city = new City("Dubai", 40);
            showWeather(city);
        }

        public static class City {
            private String name;
            private int temperature;

            public City(String name, int
                    temperature) {
                this.name = name;
                this.temperature = temperature;
            }

            public String getName() {
                return name;
            }

            public int getTemperature() {
                return temperature;
            }
        }
    }
}

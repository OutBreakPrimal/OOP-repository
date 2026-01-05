public class TokyoShmokio {
    public static String city = "Tokyo";
    public static double population = 34.5;
}
public static void main(String[] args) {
    printCityPopulation("Jakarta", 25.3);
    printCityPopulation("Seoul", 25.2);
    printCityPopulation("Delhi", 23.1);
    printCityPopulation("New York", 21.6);
}
public static void printCityPopulation(String city, double population) {
    System.out.println("The population of the city " + city + " is " + population + " million people.");
    System.out.println("While the most populous city " + TokyoShmokio.city + " has a population of " + TokyoShmokio.population + " million people.");
}
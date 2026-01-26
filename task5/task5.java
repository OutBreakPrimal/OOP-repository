package task5;

import task5.Facade.PotionConversionFacade;

public class task5 {
    public static String potionName = "Minor Healing Potion";
    public static String type = "stamina";

    public static void main(String[] args) {
        PotionConversionFacade facade = new PotionConversionFacade();
        String result = facade.convertPotion(potionName, type);
        System.out.println("Result: " + result);
    }
}

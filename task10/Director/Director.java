package task10.Director;

import task10.PizzaType;
import task10.builders.Builder;

public class Director {
    public void makeHawaiianPizza(Builder builder){
        builder.setType(PizzaType.HAWAIIAN);
        builder.setDough("plain");
        builder.setSauce("soft");
        builder.setTopping("ham + pineapple");
    }
    public void makeSpicyPizza(Builder builder){
        builder.setType(PizzaType.SPICY);
        builder.setDough("baked");
        builder.setSauce("spicy");
        builder.setTopping("pepperoni + salami");
    }
}

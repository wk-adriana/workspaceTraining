package com.endava.training.pizzeria;

public class PizzaFactory {

    public static Pizza getPizza(PizzaType pizzaType) {

        if (pizzaType.equals(PizzaType.DELUXE))
            return new DeluxePizza();

        if (pizzaType.equals(PizzaType.HAM_AND_MUSHROOM))
            return new HamAndMushroomPizza();

        if (pizzaType.equals(PizzaType.PROSCIUTO))
            return new ProsciutoPizza();

        return null;
    }
}

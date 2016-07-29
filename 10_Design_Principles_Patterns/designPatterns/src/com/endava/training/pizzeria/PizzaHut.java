package com.endava.training.pizzeria;


public class PizzaHut {
    public static void main(String[] args) {
        Pizza pizzaDeluxe = PizzaFactory.getPizza(PizzaType.DELUXE);
        Pizza pizzaHamAndMushroom = PizzaFactory.getPizza(PizzaType.HAM_AND_MUSHROOM);
        Pizza pizzaProsciuto = PizzaFactory.getPizza(PizzaType.PROSCIUTO);

        System.out.println(pizzaDeluxe.getPrice());
        System.out.println(pizzaHamAndMushroom.getPrice());
        System.out.println(pizzaProsciuto.getPrice());
    }
}

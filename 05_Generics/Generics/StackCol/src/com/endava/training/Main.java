package com.endava.training;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("Pongo");
//        EndavaStack<Animal> endavaStack = new EndavaStack<>(animal);
//        Animal raven = new Animal("Raven");
//        Animal cat = new Animal("Mr.Wolfy");
//        endavaStack.push(raven);
////        System.out.println(endavaStack.toString());
//        endavaStack.push(cat);
//        System.out.println(endavaStack.size());
//        Animal head = endavaStack.pop();
//        System.out.println(endavaStack);
//        System.out.println(endavaStack.size());
//
//        EndavaStack<Animal> endavaStack1 = new EndavaStack<>(cat, raven, animal);
//        System.out.println(endavaStack1);
          EndavaStack<Integer> endavaStack2 = new EndavaStack<>(9,46,57,265,12,30);
          System.out.println(endavaStack2);
          System.out.println(endavaStack2.pop());
          System.out.println(endavaStack2.maxElement());
    }
}

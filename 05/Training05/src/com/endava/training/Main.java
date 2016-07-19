package com.endava.training;

public class Main {

    public static void main(String[] args) {
        Monkey monkey = new Monkey();

        if (monkey.monkeyTrouble(true, true)) {
            System.out.println("Monkey1 - We are in trouble");
        }

        if (monkey.monkeyTrouble(false, false)) {
            System.out.println("Monkey2 - We are in trouble");
        }

        if (monkey.monkeyTrouble(true, false)) {
            System.out.println("Monkey3 - We are in trouble");
        }

        Parrot parrot = new Parrot();

        if (parrot.parrotTrouble(true, 6)) {
            System.out.println("Parrot1 - We are in trouble");
        }

        if (parrot.parrotTrouble(true, 7)) {
            System.out.println("Parrot2 - We are in trouble");
        }

        if (parrot.parrotTrouble(false, 6)) {
            System.out.println("Parrot3 - We are in trouble");
        }

        Number number = new Number();
        System.out.println(number.posNeg(1, -1, false));
        System.out.println(number.posNeg(-1, 1, false));
        System.out.println(number.posNeg(-4, -5, true));

        StringModifier stringModifier = new StringModifier();
        System.out.println(stringModifier.backAround("cat"));
        System.out.println(stringModifier.backAround("Hello"));
        System.out.println(stringModifier.backAround("a"));

        System.out.println(stringModifier.everyNth("Miracle", 2));
        System.out.println(stringModifier.everyNth("abcdefg", 2));
        System.out.println(stringModifier.everyNth("abcdefg", 3));

        int[] a1 = {1, 3, 4};
        System.out.println(number.scoresIncreasing(a1));
        int[] a2 = {1, 3, 2};
        System.out.println(number.scoresIncreasing(a2));
        int[] a3 = {1, 1, 4};
        System.out.println(number.scoresIncreasing(a3));

        int[] a4 = {5, 3, 6, 7, 2};
        System.out.println(number.sumHeights(a4, 2, 4));
        System.out.println(number.sumHeights(a4, 0, 1));
        System.out.println(number.sumHeights(a4, 0, 4));

        try {
            number.memoryExpensiveMethod();
        } catch (OutOfMemoryError error) {
            System.out.println(error.getMessage());
        }

        try {
            number.stackOverflowMethod();
        } catch (StackOverflowError error) {
            System.out.println(error.getMessage());
        }

        System.out.println("All errors were intercepted");

        System.out.println(number.testFinally());
    }

}

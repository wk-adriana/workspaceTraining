package com.endava.training;

import java.util.*;

public class PenguinMain {
    public static void main(String[] args) {
        PenguinHatchery penguinHatchery = new PenguinHatchery();
        Map<Penguin, Integer> penguinMap = new HashMap<>();
        Penguin penguin = null;

        for (int i = 0; i < 110000; i++) {
            penguin = penguinHatchery.hatchPenguin();
            penguinMap.put(penguin, i);
        }

        System.out.println("Before: ");
        long startTime = System.currentTimeMillis();
        System.out.println(penguinMap.get(penguin));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}

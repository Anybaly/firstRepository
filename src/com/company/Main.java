package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    // Definirea unei metode
    public static ArrayList<Integer> generateNumbersList(int range) {
        ArrayList<Integer> firstNumbersList = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            firstNumbersList.add(i + 1);
        }
        return firstNumbersList;
    }

    public static ArrayList<Integer> generateNumbersList(int range, boolean isRandom) {
        ArrayList<Integer> firstNumbersList = new ArrayList<>();
        if (isRandom) {
            Random rand = new Random();
            for (int i = 0; i < range; i++)
                firstNumbersList.add(rand.nextInt(range));
        } else {
            firstNumbersList = generateNumbersList(range);
        }

        return firstNumbersList;
    }

    public static void main(String[] args) {
        System.out.println(generateNumbersList(10, false));
        System.out.println(generateNumbersList(10));
    }
}


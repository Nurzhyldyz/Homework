package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(rec(30, 24));
        System.out.println(rec(-45, 32));
        System.out.println(rec(12, 89));
        System.out.println(rec(13, 56));
        System.out.println(rec(-12, 84));

        System.out.println(generateRandomAge() + rec(generateRandomAge(),10));
    }

    public static String rec(int tempereture, int age) {
        String toy = "Можно идти гулять";
        String toy1 = "Нельзя идти гулять";
        String toy2 = "Оставайтесь дома";
        if (age >= 20 && age <= 45 && tempereture >= -20 && tempereture <= 30) {
            return toy;
        } else if (age <= 20 && tempereture > 0 && tempereture <= 28) {
            return toy;
        }

        else
        {
            return toy2;
        }


    }
    public static int generateRandomAge(){
        Random random = new Random();
        int a = random.nextInt(10000);
        return a;
    }
}
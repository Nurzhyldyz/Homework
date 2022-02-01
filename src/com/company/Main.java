package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Оставайтесь дома");
        System.out.println("Оставайтесь дома");
        System.out.println("Оставайтесь дома");
        System.out.println("Можно идти гулять");
        System.out.println("Можно идти гулять");
    }
    public static String multiplay () {
        int ageOfMan = 35;
        int temperature = 10;
        if (ageOfMan >= 20 && ageOfMan <= 45 ||temperature >= -20 && temperature <= 30) {
            System.out.println("Можно идти гулять");


        }else if (ageOfMan <=20 || temperature >= 28 ) {
            System.out.println("Можно идти гулять");

        }else if (ageOfMan > 45 || temperature >= -10 && temperature <= 25) {
            System.out.println("Можно идти гулять");
        }else {
            System.out.println("Оставайтесь дома");


        }
        return "Оставайтесь дома";
    }

    public static int generateRandomAge() {
        int min = -40;
        int max = 45;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }
}


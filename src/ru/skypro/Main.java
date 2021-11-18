package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Первая задача
        byte fruitWatermelon = 1;
        short fruitGrapefruit = 200;
        int fruitMandarins = 653_000;
        long fruitCherry = 1_024_512_256_128L;
        float fruitApples = 1.5f;
        double fruitOrange = 0.75;


        // Вторая задача недоделана
        float boxerWeightOne = 78.2f;
        float boxerWeightTwo = 82.7f;
        var boxersWeight = boxerWeightOne + boxerWeightTwo;
        System.out.println("Общий вес двух боксеров " + boxersWeight + " кг");
        var differenceWeight = (boxerWeightOne - boxerWeightTwo) % boxersWeight;

        System.out.println("Разница между весом боксеров " + differenceWeight + " кг");


        // Третья задача
        byte bananas = 5;
        byte bananasWeight1 = 80;
        int bananasTotalWeight = bananas * bananasWeight1;
        System.out.println("Общий вес бананов " + bananasTotalWeight + " г" );

        short milk = 200;
        byte milkWeight = 105;
        var milkWeightsto = (milkWeight / 100);
        System.out.println(milkWeightsto);
        float milkTotalWeight = milk * milkWeight;
        System.out.println(milkTotalWeight);

        byte iceCream = 2;
        byte iceCreamWeight = 100;
        int iceCreamWeightTotal = iceCream * iceCreamWeight;
        System.out.println("Общий вес мороженного " + iceCreamWeightTotal + " г");

        byte egg = 4;
        byte eggWeight = 70;
        int eggsWeightTotal = egg * eggWeight;
        System.out.println("Общий вес яиц " + eggsWeightTotal + " г");
    }
}

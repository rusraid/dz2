package ru.skypro;

public class Main {

    public static void main(String[] args) {


//         Первая задача

        byte fruitWatermelon = -1;
        short fruitGrapefruit = 200;
        int fruitMandarins = 653_000;
        long fruitCherry = 1_024_512_256_128L;
        float fruitApples = 1.5f;
        double fruitOrange = 0.75;
        char c = 33;
        boolean b = 10 > 5;


//         Вторая задача

        float boxerWeightOne = 78.2f;
        float boxerWeightTwo = 82.7f;
        var boxersWeight = boxerWeightOne + boxerWeightTwo;
        System.out.println("Общий вес двух боксеров " + boxersWeight + " кг");
        float differenceWeight = (boxerWeightTwo - boxerWeightOne);
        System.out.println("Разница между весом боксеров " + differenceWeight + " кг");

//        Проверял уже после консультации как работает Math.abs
//        float differenceWeight1 = (boxerWeightOne - boxerWeightTwo);
//        System.out.println("Разница между весом боксеров " + Math.abs(differenceWeight1) + " кг");


//         Третья задача

        byte bananas = 5;
        byte bananasWeight1 = 80;
        int bananasTotalWeight = bananas * bananasWeight1;
        System.out.println("Общий вес бананов " + bananasTotalWeight + " г");

        int milk = 200;
        float mlToGrCoef = 105 / (100 * 1.0f);
        System.out.println("коэфициент молока " + mlToGrCoef);
        float milkTotalWeight = (milk * mlToGrCoef);
        System.out.println("Общий вес молока " + milkTotalWeight + " г");

//        Почему у меня получается Общий вес молока 209.99998 г?
//        я до консультации решал по другому, но получалось так же.

        byte iceCream = 2;
        byte iceCreamWeight = 100;
        int iceCreamWeightTotal = iceCream * iceCreamWeight;
        System.out.println("Общий вес мороженного " + iceCreamWeightTotal + " г");

        byte egg = 4;
        byte eggWeight = 70;
        int eggsWeightTotal = egg * eggWeight;
        System.out.println("Общий вес яиц " + eggsWeightTotal + " г");

        float breakfastWeight = (bananasTotalWeight + milkTotalWeight + iceCreamWeightTotal + eggsWeightTotal);
        System.out.println("Общий вес завтрака " + breakfastWeight + " г");
        float breakfastWeightKg = breakfastWeight / 1000;
        System.out.println("Общий вес завтрака " + breakfastWeightKg + " кг");


//        Четвертая задача

        int weightLossKg = 7;
        int weightLossG = 7 * 1000;
//        System.out.println(weightLossG);
        int weightLossMin = 250;
        int weightLossMax = 500;
        int weightLossMinDay = weightLossG / weightLossMin;
        System.out.println("При минимальной потере веса уйдёт "+ weightLossMinDay + " дней");
        int weightLossMaxDay = weightLossG / weightLossMax ;
        System.out.println("При максимальной потере веса уйдёт "+ weightLossMaxDay + " дней");
        int weightLossAverageDay = (weightLossMaxDay + weightLossMinDay) / 2;
        System.out.println("В среднем на потерю веса уйдёт "+ weightLossAverageDay + " дней");

//       Второй вариант
        int weightLossAv = ((weightLossMax - weightLossMin) / 2) + weightLossMin;
//        System.out.println(weightLossAv);
        int weightLossAvDay = weightLossG / weightLossAv;
        System.out.println("В среднем на потерю веса уйдёт " + weightLossAvDay + " дней");


//        Пятая задача

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int percent = 10;
        float NewSalaryPercent = 1 + (10 /100f);

        int newMashaSalary = (int) (mashaSalary * NewSalaryPercent);
        int newDenisSalary = (int) (denisSalary * NewSalaryPercent);
        int newKristinaSalary = (int) (kristinaSalary * NewSalaryPercent);

        int yearOrMonth = 12;

        int mashaSalaryYear = mashaSalary * yearOrMonth;
        int denisSalaryYear = denisSalary * yearOrMonth;
        int kristinaSalaryYear = kristinaSalary * yearOrMonth;
//        System.out.println(MashaSalaryYear);
//        System.out.println(DenisSalaryYear);
//        System.out.println(KristinaSalaryYear);
        int mashaSalaryYearNew = newMashaSalary * yearOrMonth;
        int denisSalaryYearNew = newDenisSalary * yearOrMonth;
        int kristinaSalaryYearNew = newKristinaSalary * yearOrMonth;
//        System.out.println(MashaSalaryYearNew);
//        System.out.println(DenisSalaryYearNew);
//        System.out.println(KristinaSalaryYearNew);

        System.out.println("Новая месячная зарплата Маши составляет: " + newMashaSalary + " Рублей. Годовой доход вырос на: " + (mashaSalaryYearNew - mashaSalaryYear) + " Рублей");
        System.out.println("Новая месячная зарплата Дениса составляет: " + newDenisSalary + " Рублей. Годовой доход вырос на: " + (denisSalaryYearNew - denisSalaryYear) + " Рублей");
        System.out.println("Новая месячная зарплата Кристины составляет: " + newKristinaSalary + " Рублей. Годовой доход вырос на: " + (kristinaSalaryYearNew - kristinaSalaryYear) + " Рублей");

    }
}

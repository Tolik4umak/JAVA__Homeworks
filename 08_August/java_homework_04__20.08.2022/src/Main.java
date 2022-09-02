public class Main {
    public static void main(String[] args) {
          /*
        Second level: Допустим, у вас есть прибор, у которого есть 3 колбы.
        Каждая колба имеет датчик температуры. Считается, что прибор работает правильно,
        если температура в одной из трех колб (не известно в какой) температура более 150 градусов,
        а в остальных менее100 градусов, и при этом сумма температур всех трех колб не превышает 250 градусов.
         */

        // Вводные данные
        System.out.println("Second level:");
        int colba1 = 10;
        int colba2 = 151;
        int colba3 = 10;

        // Решение


        boolean isAllColbsless100 = (((colba1 < 100 & colba2 < 100) ^ (colba1 < 100 & colba3 < 100)^(colba2 < 100 & colba3 < 100))&(colba1 > 150 ^ colba2 > 150 ^ colba3 > 150));
        boolean isColbsSumMore250 = ((colba1 + colba2 + colba3) <= 250);

        boolean isMachinWork = (isAllColbsless100 == true & isColbsSumMore250 == true);

        // Вывод на екран

        System.out.println(isAllColbsless100);
        System.out.println(isColbsSumMore250);

        if (isMachinWork == true) {
            System.out.println("Прибор работает правильно");
        } else {
            System.out.println("Прибор работает НЕПРАВИЛЬНО");
        };

        System.out.println("-----------------------------------");

        /*
        First level: Допустим, у вас есть прибор, у которого есть 3 колбы.
        Каждая колба имеет датчик температуры. Считается, что прибор работает
        правильно, если температура в каждой из трех колб не меньше 100 или есть такая колба,
         температура которой более 200 градусов.
         Напишите программу проверки корректности работы такого прибора.
         */

        // Вводные данные
        System.out.println("First level:");
        int flask1 = 650;
        int flask2 = 100;
        int flask3 = 800;

        // Решение

        boolean isMachinCorrect = (flask1 > 100 & flask2 > 100 & flask3 > 100) | (flask1 > 200 | flask2 > 200 | flask3 > 200);

        // Вывод на екран
        if (isMachinCorrect == true) {
            System.out.println("Прибор работает ПРАВИЛЬНО");
            System.out.println("Температурные режимы колб соблюдены");
        } else {
            System.out.println("ВНИМАНИЕ!!!");
            System.out.println("Прибор работает НЕПРАВИЛЬНО,");
            System.out.println("Температурный режим колб нарушен");
            System.out.println("Немедленно евакуируйте персонал");
        };

    }
}
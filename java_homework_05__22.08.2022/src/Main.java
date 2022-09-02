public class Main {
    public static void main(String[] args) {
 /*
        First level: Используя знания об операторе IF,
        напишите программу, которая выводит на экран большее из 3 чисел.
        Числа заданы в виде переменных num1, num2, num3.
         */

        // Вводные данные
        int num1 = 5;
        int num2 = 58;
        int num3 = 32;

        String biggestNum = "Самое большое число - ";

        // Вывод на екран


        if (num1 > num2 && num1 > num3) {
            System.out.println(biggestNum + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(biggestNum + num2);
        } else {
            System.out.println(biggestNum + num3);
        };

    }
}
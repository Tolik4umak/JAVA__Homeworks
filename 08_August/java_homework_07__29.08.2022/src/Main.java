import com.sun.source.util.SourcePositions;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

    /* Second level:
    Необходимо написать программу, которая печатает все целые числа в диапазоне  между num1 и num2 включительно.
    Учтите, num1 может быть как меньше, так больше или равно  num2.
        Например: num1=3   num2=5;   Выводим
        3
        4
        5


        В предыдущей задаче, для каждого числа, которое делится на 2 выводить надпись «делиться на 2».
        Для каждого числа, которое делится на 3 выводить надпись «делится на 3»

     */
        // Вводные данные
        int num1 = 23;
        int num2 = 10;

        // Решение
        int numStart = 0;
        int numEnd = 0;

        if (num1 < num2) {
            numStart = num1;
            numEnd = num2;
        } else if (num1 >= num2) {
            numStart = num2;
            numEnd = num1;
        } ;


        // Вывод на екран
        while (numStart <= numEnd) {

            if ((numStart % 2 == 0)&&(numStart % 3 == 0)) {
                System.out.printf("%d делится на 2 и на 3 %n", numStart);
            } else if (numStart % 2 == 0) {
                System.out.printf("%d делится на 2 %n", numStart);
            } else if (numStart % 3 == 0) {
                System.out.printf("%d делится на 3 %n", numStart);
            } else{
                System.out.println(numStart);
            }
            numStart++;

        }


    }
}
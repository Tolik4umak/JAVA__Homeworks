public class Main {
    public static void main(String[] args) {

        /*  First level: 1)
        2)  Создать новый проект написать. Написать программу, в которой задано
        2 дробных числа. Программа должна выводить на экран результат сложения,
         вычитания, умножения и деления этих чисел. Например: задано 2 переменных:
         10.6 и 2.2  в результате:
            10.6 + 2.2=12.8
            10.6 - 2.2=8.4lsc
            10.6 *2.2=23.32
            10.6 / 2.2=4.818181         */

        double num1 = 10.6;
        double num2 = 2.2;
        System.out.println("First level.");
        System.out.println("Сложение: " + (num1 + num2));
        System.out.println("Вычитания: " + (num1 - num2));
        System.out.println("Умножения: " + (num1 * num2));
        System.out.println("Деления: " + (num1 / num2));

        System.out.println("-----------------------------------------");
/*
            Second level: Создать новый проект и написать программу рассчитывающую,
        на сколько увеличится площадь пиццы, если ее диаметр увеличить на N сантиметров.
        Подсказка: площадь круга можно вычислить по формуле 3,14RR.
        Например: Исходная пицца диаметр 10 см (т.е. R1=10/2=5).
        Диаметр новой пиццы 16 см (т.е. R1=16/2=8). Ответ: 122.46
 */
        //Решение
        // Вводные данные
        double pi = 3.14;                                                       // Число пи
        double pizzaOriginalDiameter = 10.0;                                    // Диаметр исходной пицци
        double addDiameter = 6;                                                 // Коефициент N (на сколько увеличится диаметр пицци)

        // 1. Считаем диаметр новой пицци
        double pizzaNewDiameter = pizzaOriginalDiameter + addDiameter;          // Диаметр новой пицци
        // 2. Считаем радиусы пицц
        double pizzaOriginalRad = pizzaOriginalDiameter / 2;                    // Радиус исходной пицци
        double pizzaNewRad = pizzaNewDiameter / 2;                              // Радиус новой пицци
        // 3. Считаем площади исходной и новой пиццы
        double pizzaOriginalArea = pi * (pizzaOriginalRad * pizzaOriginalRad);  // Площадь исходной пицци
        double pizzaNewArea = pi * (pizzaNewRad * pizzaNewRad);                 // Площадь новой пицци
        // 4. Считаем разницу площадей пицц
        double pizzaAreaGrow = pizzaNewArea - pizzaOriginalArea;                // На сколько увеличится площадь новой пицци
        System.out.println("Second level.");
        System.out.println("Если диаметр пицци увеличить на " + addDiameter + "см, то площадь пицци увеличится на "
                + pizzaAreaGrow + "см.");
    }
}
























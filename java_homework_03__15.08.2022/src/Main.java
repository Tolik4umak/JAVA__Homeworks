public class Main {
    public static void main(String[] args) {
/*
        First level: Реализуйте программу, которая считает стоимость покупки, учитывая НДС.
        Т.е. дана стоимость товара и размер НДС (например, 19%)
        Ваша программа должна рассчитать, сколько, сколько вы должны оплатить, учитывая налог.


 */

        // Вводные данные
        float productPrice = 58.33f;
        float taxRate = 19.5f;

        // Решение
        float taxAmount = productPrice * taxRate / 100;
        String productFullPrice = String.format("%.2f", (taxAmount + productPrice));

        // Вывод на екран
        System.out.println("Стоимость товара без НДС = " + productPrice + " EURO.");
        System.out.println("Размер НДС = " + taxRate + "%");
        System.out.println("Стоимость товара с учетом НДС = " + productFullPrice + " EURO.");

    }
}
public class Main {
    public static void main(String[] args) {
        /*
            Написать метод String replace(String str, char oldChar, char newChar)
            который в переданной строке str меняет все символы  oldChar на символы newChar.
            Например: replace(«саша», ‘c’, ‘м’) -> «маша»

         */

        System.out.println(replace("корона", 'н', 'в'));
        System.out.println(replace("саша", 'с', 'м'));
        System.out.println(replace("коза", 'к', 'л'));
        System.out.println(replace(replace("коза", 'к', 'л'), 'о', 'и'));
        System.out.println(replace(replace(replace("коза", 'к', 'л'), 'о', 'и'), 'з', 'с'));
        System.out.println(replace("Мурка", 'М', 'т'));

    }
    public static String replace(String str, char oldChar, char newChar) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar) {
                newStr = newStr + newChar;
            } else {
                newStr = newStr + str.charAt(i);
            }
        }
        return newStr;
    }


}
public class Main {
    public static void main(String[] args) {

        /* LEVEL2
             Реализовать мметод String replace(String str, String oldStr, String newStr)
             который  в данной строке str менет все подстроки oldStr на подстроки newStr
             Например:
                ("Hello world!", "world", "all") - "Hello all!"
                ("Hello world!", "l", "L") - "HeLLo worLd!"
                ("Hello world!", "qwe", "L") - "Hello world!"
                ("Hello world!", "ll", "") - "Heo world!"
            Ограничения: в данной задаче нельзя использовать стандартные методы
                String, кроме length(), charAt() и equals()
        */

        System.out.println(replace("Hello world!", "world", "all"));
        System.out.println(replace("Hello world!", "l", "L"));
        System.out.println(replace("Hello world!", "qwe", "L"));
        System.out.println(replace("Hello world!", "ll", ""));


    }


    public static String replace(String str, String oldStr, String newStr) {
        String changeStr = "";

        for (int i = 0; i < str.length(); i++) {

            String subStr = "";
            for (int k = i; k < oldStr.length() + i && k < str.length(); k++) {
                subStr += str.charAt(k);
            }

            if (subStr.equals(oldStr)) {
                changeStr += newStr;
                i = i + oldStr.length() - 1;
            } else {
                changeStr += str.charAt(i);
            }

        }
        return changeStr;

    }
}
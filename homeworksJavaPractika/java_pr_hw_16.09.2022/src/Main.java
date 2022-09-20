public class Main {
    public static void main(String[] args) {

        /*First level: Написать метод, возвращающий целое число равное двойной длине строки,
        принимаемой в качестве аргумента метода.  Пример: hello -> 10*/

        System.out.println(strLen("abcd"));

        /*Second level: Написать 2 метода:
         один метод переставляет первую букву в конец строки (abcd-> bcda).
         Второй  метод переставляет последнюю букву в начало строки (abcd->dabc)*/
        System.out.println(str("abcd",1));
        System.out.println(stroka("abcd"));
    }

    public static int strLen(String str) {
        return str.length()*2;
    }

    public static String str(String str, int breakpoint) {
        return str.substring(breakpoint) + str.substring(0, breakpoint);
    }

    public static String stroka(String str) {
        return str.substring(str.length()-1) + str.substring(0,str.length()-1);
    }
}
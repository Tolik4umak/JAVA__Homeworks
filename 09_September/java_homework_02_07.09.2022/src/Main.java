public class Main {
    public static void main(String[] args) {
/*  Second level:
        Написать программу, которая выводит на экран таблицу умножения (таблицу Пифагора).
        Естественно, использовать циклы.
*/
        int res ;
        int row =1;
        int coll=1;


        for(;coll<10;coll++){
            for (;row<10;row++){
                res = coll*row;
                System.out.printf("  %2d", res);
            }
            row=1;
            System.out.printf("%n");
        }


        System.out.println("-----------------");

/*   First level:
         Дана строка и 2 числа int: startIndex, endIndex. Необходимо получить и вывести на экран строку,
         которая состоит из всех символов исходной строки, начиная с позиции startIndex (включительно)
         до позиции endIndex (не включительно).
         Если startIndex  «не попадает в строку» или больше endIndex выводим “error”.
         Если endIndex не «попадает в строку»,  выводим, начиная со startIndex до конца строки.
         Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length().

                “Java is a very popular language”,  startIndex=5  endIndex=13  -> “is a ver”
                “Java is a very popular language”,  startIndex=5  endIndex=-13  -> error
                “Java is a very popular language”,  startIndex=5  endIndex=136  -> “is a very popular language”
*/
        String str = "Java is a very popular language";
        int startIndex = 31;
        int endIndex = 31;

        String newStr = "";


        if (startIndex>=str.length() || startIndex<0 || startIndex>endIndex ) {
            newStr = "error";
        } else if (startIndex==endIndex) {
            newStr += str.charAt(startIndex);
        } else {
            for(;startIndex<endIndex && startIndex<str.length();startIndex++){
                    newStr += str.charAt(startIndex);
            }
        }


        System.out.println(newStr);



    }
}
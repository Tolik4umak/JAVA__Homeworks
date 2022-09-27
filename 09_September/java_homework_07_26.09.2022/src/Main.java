public class Main {
    public static void main(String[] args) {
    /* 1 . Реализовать метод, который возвращает сколько раз заданная имя встречается в массиве
     начиная с позиции start до позиции finish (включительно). Если строка не найдена, то возвращаем 0
        Например:
        countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,1,6) ->2
        countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “sad”,0,6) ->0
        countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,0,7) ->3
        */

        String[] str1 = {"jack", "nick", "john", "jack", "tom", "john", "ann", "john"};

        System.out.println(getRepeat(str1, "john", 1, 6));
        System.out.println(getRepeat(str1, "sad", 0, 6));
        System.out.println(getRepeat(str1, "john", 0, 7));
        System.out.println(getRepeat(str1, "john", 7, 7));
        System.out.println(getRepeat(str1, "john", 0, 0));
        System.out.println(getRepeat(str1, "john", 1, 0));
        System.out.println(getRepeat(str1, "john", -1, str1.length));
        System.out.println(getRepeat(str1, "john", 0, str1.length));
        System.out.println(getRepeat(str1, "john", 0, str1.length - 1));


        System.out.println("---------------------");


        /*Реализовать метод, который создает массив из первых n четных чисел,
     начиная с заданного числа start.
       Например, для заданных n=4, start=21: {22,24,26,28}
     */

        int[] arr1 = createNewArr(4, 21);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        };
        System.out.println("");

        int[] arr2 = createNewArr(10, 16);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        };
        System.out.println("");

        int[] arr3 = createNewArr(2, -3);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        };

    }


    public static int getRepeat(String[] str, String subStr, int start, int finish) {

        int repeat = 0;

        if ((finish < str.length) && (finish >= 0) && (start < str.length) && (start >= 0) && (start <= finish)) {
            for (int i = start; i <= finish; i++) {
                if (str[i].equals(subStr)) {
                    repeat++;
                }
            }
            ;
        } else {
            repeat = -1;
        }
        ;


        return repeat;
    }


    public static int[] createNewArr(int n, int start) {

        int[] newArr = new int[n];

        for (int i = 0; i < newArr.length; start++ ) {

            if (start % 2 == 0) {
                newArr[i] = start;
                i++;
            }
        }
        ;


        return newArr;
    }

    ;;


}
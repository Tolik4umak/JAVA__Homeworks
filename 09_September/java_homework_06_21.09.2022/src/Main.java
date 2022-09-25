public class Main {
    public static void main(String[] args) {
    /*Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве.
    Например: {1,3,6,-1,4,-5,9} -> -5*/

        int[] arr = {1,2,-27,4555,6,1002};
        System.out.println(minNum(arr));



        System.out.println("------------------------");

    /*Дан массив строк. Реализовать метод, который возвращает индекс самой длинной строки в данном массиве.
          Например: {“qwe”,”axgsfg”,”qwertyuio”,”qas”} -> 2
     */

        String[] strArr = {"qwe","axcvbn","qwertyuio","qas"};
        System.out.println(longestWordIndex(strArr));
    }

    public static int minNum(int[] arr){

        int min = arr[0];

        for (int i = 0 ; i < arr.length ; i++){

            if(arr[i]<min){
                min= arr[i];
            }

        }

        return min;
    }

    public static int longestWordIndex(String[] arr){
        int longest = 0;
        int strLen = 0;

        for (int i = 0 ; i < arr.length ; i++){
            if(strLen<arr[i].length()){
                strLen= arr[i].length();
                longest = i;
            }

        }
        return longest;
    }


}
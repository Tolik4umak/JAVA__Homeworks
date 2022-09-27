public class Main {
    public static void main(String[] args) {
        /*First level: Дан массив целых чисел ( не пустой) .
         Написать метод, возвращающий наибольший элемент  этого массива .
         */

        int[] arr = {-1,2,-9,4,-5,6};
        System.out.println(max(arr));
    /*Second level: Дан массив целых чисел ( не пустой) .
    Написать метод, возвращающий разницу между наибольшим и наименьшим  элементами  этого массива .

        { 5,2,9,1} -> 8*/

        System.out.println(difference(arr));


    }
    public static int max(int[] arr){

        int max = arr[0];

        for (int i = 1 ; i < arr.length ; i++){

            if(arr[i]>max){
                max= arr[i];
            }

        }

        return max;
    }
    public static int difference(int[] arr){

        int min = arr[0];

        for (int i = 1 ; i < arr.length ; i++){

            if(arr[i]<min){
                min= arr[i];
            }

        }
        return max(arr)- min;
    }

}
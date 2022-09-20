public class Main {
    public static void main(String[] args) {
        /*
        Реализовать метод, который создает и заполняет массив числами int в диапазоне от minValue до maxValue
        */
        arrCreate(5, 8);
        arrCreate(-5, 8);
        arrCreate(3, 3);
        arrCreate(-3, 0);
        arrCreate(0, 0);
        arrCreate(100, 8);

        System.out.println("----------------------------------");

         /*
        Дан массив int. Реализовать метод, который считает сумму положительных  элементов массива.
            {3, 2, -1, 5, -3} ->10
        */

        int[] arr2 = {3, 2, -1, 5, -3};
        int[] arr3 = {};
        int[] arr4 = {0, 0, 0, 0, 0};
        int[] arr5 = {-3, -2, -1, -5, -3};
        int[] arr6 = {3, 2, 1, 5, 3};
        sum(arr2);
        sum(arr3);
        sum(arr4);
        sum(arr5);
        sum(arr6);

    }

    public static int[] arrCreate(int minValue, int maxValue) {
        int arrLen = (maxValue - minValue + 1);
        int[] arr;

        if (maxValue < minValue) {
            System.out.println("error");
            arr = new int[1];
        } else {
            arr = new int[arrLen];
            for (int i = 0; i < arrLen; i++) {
                arr[i] = minValue;
                System.out.printf("%d ", arr[i]);
                minValue++;
            }
        }
        System.out.println("");
        return arr;
    }


    public static void sum(int[] arr) {
        int arrSum=0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>0){
                arrSum+=arr[i];
            }
        }
        System.out.println(arrSum);

    }
}
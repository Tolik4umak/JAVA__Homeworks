public class Main {
    public static void main(String[] args) {

/*   LEVEL 1
        Дано целое число num. Необходимо написать программу,
        которая выводит на экран таблицу умножения num  до 10.
         Например, если num=3 то вывод должен быть таким:

           	3*1=3
           	3*2=6
           	3*3=9
           	-----
          	3*9=27
           	3*10=30
*/


        //Вводные
        int num = 5;

        // Решение

        int multiplier = 10;
        int i = 0;

        // На экран
        while(i<multiplier){
            System.out.println(num+" * "+(++i)+" = "+ num*i);
        }


        System.out.println("---------------------------------");


/*      LEVEL 2
            Дано целое число num. Необходимо написать программу, которая считает, сколько разрядов в этом числе.
            Например:
           	3 -> 1
           	343 -> 3
           	98761 -> 5
*/


        //Вводные
        long num1 = 10;

        // Решение

        if(num1<0){
            num1*=-1;
        }


        long step = 1;
        int digit = 0;

        while (step<=num1){
            digit++;
            step*=10;
        }

        // На экран

        System.out.println(num1+" -> "+digit);




    }
}
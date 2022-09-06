public class Main {
    public static void main(String[] args) {
/*
            First level: С использованием цикла while yаписать метод, печатающий куб числа от 0 до данного чисда n.
            Пример: на входе n=3  на выходе 0,1,8,27
 */
        int num = 5;
        int degree = 3;
        int degreeCount = 0;
        int numCount = 0;
        int res = 1;

        while (numCount<=num) {
            while (degreeCount < degree) {
                res *= numCount;
                degreeCount++;
            };
            System.out.println(numCount+" in "+degree+" degree = "+res );
            numCount++;
            degreeCount=0;
            res=1;
        }


        System.out.println("-----------------");

/*
            Second level: С использованием цикла while yаписать метод,
            печатающий результат  умножения данного числа n  на все целые числа от 0 до n..
            Пример: на входе n=3  на выходе 0,3,6,9
 */
        int n=3;
        int i=-1;

        while (i<n){
            System.out.println((++i)+" * "+n+" = "+n*i);
//            total=1;
        }




    }
}
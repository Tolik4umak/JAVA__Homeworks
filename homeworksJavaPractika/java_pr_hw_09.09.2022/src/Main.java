public class Main {
    public static void main(String[] args) {

        System.out.println("First level");
        count(5);


        System.out.println();
        System.out.println("------------");
        System.out.println();



        System.out.println("Second level");
        System.out.println(sum(100));

    }
    /*
        First level: C помощью цикла for написать метод, печатающий цифры от 1 до  числа  n
     */
    public static void count (int n) {

        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }
    /*
        Second level: C помощью цикла for написать метод возвращающий сумму цифр от 1 до числа n
     */
    public static int sum (int n) {

        int sum=0;

        for(int i = 1; i<=n; i++){
            sum = sum+i;
        }

        return sum;
    }


}
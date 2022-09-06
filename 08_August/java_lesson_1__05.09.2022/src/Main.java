public class Main {
    public static void main(String[] args) {

        String str ="hello Java";

//        int i = str.length()-1;
//        while (i>=0){
//            System.out.print(str.charAt(i));
//            i--;
//        }
//        System.out.println("-------------------");
//        String str3="";
//        i=str.length()-1;
//        while (i>=0){
//            str3+=str.charAt(i);
//            i--;
//        }
//        System.out.print(str.charAt(i));

        String newStr = "" ;
        int i = 0;
        while (i<str.length()){
            if (str.charAt(i)!=' '){
                newStr += str.charAt(i);

            }
            i++;
        }

        System.out.print(newStr);






    }
}
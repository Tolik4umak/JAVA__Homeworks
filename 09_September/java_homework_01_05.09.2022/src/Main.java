public class Main {
    public static void main(String[] args) {

/*
            Дана строка строка, состоящая из нескольких слов разделенных пробелам,
            необходимо сформировать и вывести на экран строку вида содержащую
            первое и последнее слово исходной строки.

            Примечание: слова разделены одним пробелом, строка не содержит знаков препинания.
            Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length().

            Например:
                “Java is a very popular language” ->  “Java language”

 */


        String frase = "Java is a very popular language";


        String newFrase = "";
        int i = 0;
        int lastSpace = 0;


//                       Находим индекс последнего пробела
        while(i<frase.length()){
            if (frase.charAt(i)==' '){
                lastSpace=i;
            };
            i++;
        }

//                      Обнуляем i для следующего цикла
        i=0;

//                      При первом пробеле на пути перебора меняем значение i на индекс поледнего пробела
        while(i<frase.length()){

            if ((frase.charAt(i)!=' ')||(frase.charAt(lastSpace)==' ')){
                newFrase += frase.charAt(i);
            };
            if (frase.charAt(i)==' '){
                i=lastSpace;
            };
            i++;

        }


        System.out.println(newFrase);

    }
}
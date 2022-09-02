public class Main {
    public static void main(String[] args) {
        /*
        Second level: Представьте, Вы пишите программу для расчета штрафов за превышение скорости.  
        В качестве исходных данных у вас: ограничение скорости на данном участке дороги,
        скорость, с которой двигался автомобиль и признак того, что нарушение было совершено на автобане. 
        Естественно, все три значения заданы переменными. Таблица штрафов такая:
        
        
        превышение менее 10% от скоростного ограничения – не штрафуется
        
        10% - менее 20% от скоростного ограничения – 50 евро
        
        20% - менее 30% от скоростного ограничения – 150 евро не на автобане, и 200 на автобане
        
        от 30% и выше - 500евро плюс, если нарушение на автобане, лишение прав на 3 месяца. 
        
        
        Реализуйте программу, которая рассчитывает штраф и выводит соответствующее сообщение на экран
         */

        // Вводные данные
        int speedLimit = 50;
        int carSpeed = 70;
        boolean isAutoban = false;
        
        // Решение
        int speedOver = carSpeed*100/speedLimit-100 ;
        
        String panishmentNo = "не штрафуется";
        String panishment1 = "штраф - 50 евро";
        String panishment2 = "штраф – 150 евро";
        String panishment3 = "штраф – 200 евро";
        String panishment4 = "штраф – 500 евро";
        String panishment5 = "штраф – 500 евро плюс лишение прав на 3 месяца";
        
        // Вывод на екран

        if (speedOver<10) {
            System.out.println(panishmentNo);
        } else if(speedOver>=10 && speedOver<20) {
             System.out.println(panishment1);
        } else if(speedOver>=20 && speedOver<30) {
            if(isAutoban){
                 System.out.println(panishment3);
            } else{
                 System.out.println(panishment2);
            };
            
        } else if(speedOver>=30) {
            if(isAutoban){
                 System.out.println(panishment5);
            } else{
                 System.out.println(panishment4);
            };
            
        };

    }
}

package itstep.learning.oop;

public class OopDemo {

    public void run(){
        System.out.println("OopDemo");
        new AutoShop().run();
    }
}
/*
ООП - парадигма - підхід, набір традицій, засобів, інструментів до програмування

Функціональна
ООП
    Прототипна
Імперативна
    Процедурна
Декларативна
    Логічна

Продаж авто

Audi Q5  | Crossover
Audi RS6 | Car
Audi RS7 | Car
BMW 320  | Car
VW Golf  |
Renault C-Truck | Truck
Renault Master  | Bus
Kawasaki Ninja  | Bike

Autoshop  <>----> Vehicle (транспортний засіб)
                     △
                   / | \
     Bike    Bus     Truck    Car    Crossover

 */
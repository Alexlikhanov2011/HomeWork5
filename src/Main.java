public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        System.out.println("Задание 1 + 2");

        int clientOS = 0;
        int clientDeviceYear = 2017;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}
            else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            if (clientOS == 0 && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }



        }
        public static void task2() {
            System.out.println("Задание 3");

            int year = 2022;
            if(year%4==0 && year%100 !=0 || year%400==0) {
                System.out.println(year + " год является високосным");}
            else {
                System.out.println(year + " год не является високосным");
            }
      }
      public static void task3() {
          System.out.println("Задание 4");
          int deliveryDistance = 111;
          int timeDistance = 1;
          if (deliveryDistance <= 20){
    System.out.println( "Потребуется дней: " + timeDistance );}
          else if (deliveryDistance > 20 && deliveryDistance <= 60 ) {
              System.out.println("Потребуется дней: " + timeDistance *2);}

         if (deliveryDistance > 60 && deliveryDistance <= 100){
              System.out.println("Потребуется дней: " + timeDistance *3);}

          else if (deliveryDistance > 100){
              System.out.println("Доставки на такое расстояние нет");}
    }

public static void task4(){
    System.out.println("Задача №5");
    int monthNumber = 12;
    switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println("Зима");
            break;
        case 3:
        case 5:
        case 4:
            System.out.println("Весна");
            break;
        case 6:
        case 8:
        case 7:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
            break;
        default:
            System.out.println("Не верное значение");


}}









    }



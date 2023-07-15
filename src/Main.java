public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2024;
        int yearException = 400;
        int yearException2 = 100;
        int yearException3 = 4;


        if (year % yearException == 0) {
            System.out.println("год  является високосным");
        } else if (year % yearException3 == 0 && year % yearException2 != 0) {
            System.out.println("год  является  високосным");
        } else {
            System.out.println("год не является  високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 10;
        int deliveryTime = 0;

        deliveryTime++;

        if (deliveryDistance >= 20) {
            deliveryTime++;
        }
        if (deliveryDistance >= 60) {
            deliveryTime++;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
}





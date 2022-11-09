public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке");
        // Задание 2
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке. Установите облегченную версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке. Установите облегченную версию приложения для Android по ссылке");
        // Задание 3
        int year = 400;
        boolean leapУear = year % 4 == 0;
        if (leapУear && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
        // Задание 4
        int deliveryDistance = 95;
        int needDays = 1;
        if (deliveryDistance <= 20 && deliveryDistance > 0) {
            System.out.println("Потребуется дней: " + needDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            needDays = needDays + 1;
            System.out.println("Потребуется дней: " + needDays);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            needDays = needDays + 2;
            System.out.println("Потребуется дней: " + needDays);
        } else if (deliveryDistance > 100) {
            System.out.println("Мы не сможем доставить Вам карту");
        } else System.out.println("Некорректное значение");
        // Задание 5
        int month = 12;
        switch (month) {
            case 1:
                System.out.println("Это зима!");
                break;
            case 2:
                System.out.println("Это зима!");
                break;
            case 3:
                System.out.println("Это весна!");
                break;
            case 4:
                System.out.println("Это весна!");
                break;
            case 5:
                System.out.println("Это весна!");
                break;
            case 6:
                System.out.println("Это лето!");
                break;
            case 7:
                System.out.println("Это лето!");
                break;
            case 8:
                System.out.println("Это лето!");
                break;
            case 9:
                System.out.println("Это осень!");
                break;
            case 10:
                System.out.println("Это осень!");
                break;
            case 11:
                System.out.println("Это осень!");
                break;
            case 12:
                System.out.println("Это зима!");
                break;
            default:
                System.out.println("Некорректное значение");
        }
    }
}
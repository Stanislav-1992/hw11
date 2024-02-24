import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        checkYear(2021);
        checkVersionOS(1, 2024);
        int deliveryDays = calculationDeliveryDays(95);
        if (deliveryDays != -1) {
            System.out.println("Количество дней доставки: " + deliveryDays);
        } else {
            System.out.println("Доставка невозможна");
        }
    }

    static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }

    static void checkVersionOS(int os, int clientDeviceYear) {
        if (os < 0 || os > 1) {
            System.out.println("Такой OS не существует");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию для IOS");
        } else if (os == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию IOS");
        } else if (os == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию для Android");
        } else if (os == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию Android");
        }
    }

    static int calculationDeliveryDays(int distance) {
        if (distance > 100 || distance <= 0) {
            return -1;
        }
        /*int deliveryDays = 0;
        if (distance > 0 && distance <= 20) {
            deliveryDays++;
        }
        if (distance > 20 && distance <= 60) {
            deliveryDays++;
        }
        if (distance > 60 && distance <= 100) {
            deliveryDays++;
        }*/
        int deliveryDays = 1;
        if (distance >= 20) {
            deliveryDays++;
        }
        if (distance >= 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }
}

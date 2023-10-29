package main_tasks.Travel_time;

/*
Время в пути
 */

public class TravelTime {
    public static void main(String[] args) {
        int distanceHomeToWork = 20;
        double taxiSpeed = 40;
        double timeToOffice = distanceHomeToWork / taxiSpeed;
        double taxiDecelerationInTheEvening = 1.2;
        double timeToHome = timeToOffice * taxiDecelerationInTheEvening;

        System.out.println("Расстояние от дома до офиса (в км): " + distanceHomeToWork);
        System.out.println("Скорость такси (км/ч): " + taxiSpeed);
        System.out.println("Тестировщик доберется до работы из дома, за время (час): " + timeToOffice);
        System.out.println("Коэффициент замедления транспорта вечером: " + taxiDecelerationInTheEvening);
        System.out.println("Тестировщик доберется до дома с работы, за время (час): " + timeToHome);


    }
}

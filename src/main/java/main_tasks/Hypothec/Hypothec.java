package main_tasks.Hypothec;

/*
Первоначальный взнос по ипотеке
 */

public class Hypothec {
    public static void main(String[] args) {
        int apartmentPrice = 3_200_000;
        double downPaymentPercentage = 15.9;
        double coefficientPayment = downPaymentPercentage / 100;
        double downPaymentAmount = apartmentPrice * coefficientPayment;

        System.out.println("Стоимость квартиры: " + apartmentPrice);
        System.out.println("Процент первоначального взноса: " + downPaymentPercentage + "%");
        System.out.println("Сумма первоначального взноса: " + downPaymentAmount);
    }
}

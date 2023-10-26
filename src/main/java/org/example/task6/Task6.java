package org.example.task6;

/*
Первоначальный взнос по ипотеке
 */

public class Task6 {
    public static void main(String[] args) {
        int apartmentPrice = 3_200_000;
        double downPaymentPercentage = 15.9;
        double downPaymentAmount = apartmentPrice / 100 * downPaymentPercentage;

        System.out.println("Стоимость квартиры: " + apartmentPrice);
        System.out.println("Процент первоначального взноса: " + downPaymentPercentage + "%");
        System.out.println("Сумма первоначального взноса: " + downPaymentAmount);
    }
}

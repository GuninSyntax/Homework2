package org.example.task8;

/*
Скидки на рубашки
 */

public class Task8 {
    public static void main(String[] args) {

        int shirtPrice = 1400;
        int numberOfSelectedShirts = 3;
        int quantityForDiscount = 5;
        int needAddedForDiscount = quantityForDiscount - numberOfSelectedShirts;
        int totalPriceSelectedShirts = shirtPrice * numberOfSelectedShirts;
        int totalPriceShirtsForDiscount = shirtPrice * needAddedForDiscount;
        double discountPercentage = 30;
        double discountedPricesForAllShirts = shirtPrice / 100 * (100 - discountPercentage) * quantityForDiscount;
        double discountedPriceForOneShirt = shirtPrice / 100 * (100 - discountPercentage);
        double amountOfMoneySaved = quantityForDiscount * shirtPrice - discountedPricesForAllShirts;
        double numberOfFreeShirts = amountOfMoneySaved / shirtPrice;


        System.out.println("Цена одной рубашки без скидки: " + shirtPrice);
        System.out.println("Кол-во выбранных рубашек: " + numberOfSelectedShirts);
        System.out.println("Кол-во рубашек, которые нужно купить, чтобы получить скидку: " + quantityForDiscount);
        System.out.println("Кол-во рубашек которые нужно добавить к купленным, чтобы получить скидку: " + needAddedForDiscount);
        System.out.println("Общая цена уже выбранных рубашек без скидки: " + totalPriceSelectedShirts);
        System.out.println("Общая цена рубашек(без скидки), которые нужно докупить, чтобы получить скидку: " + totalPriceShirtsForDiscount);
        System.out.println("Процент скидки: " + discountPercentage);
        System.out.println("Цена всех рубашек со скидкой: " + discountedPricesForAllShirts);
        System.out.println("Цена одной рубашки со скидкой: " + discountedPriceForOneShirt);
        System.out.println("Количество сэкономленных денег, если рубашки куплены со скидкой: " + amountOfMoneySaved);
        System.out.println("количество рубашек, которые из-за скидки получены на халяву: " + numberOfFreeShirts);
    }
}

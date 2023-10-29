package main_tasks.Glass;

/*
Стакан, который наполовину полон
 */

public class Glass {
    public static void main(String[] args) {
        int glassVolume = 250;
        double glassFillingPercentage = 80;
        double coefficientFilling = glassFillingPercentage / 100;
        double actualGlassFilling = glassVolume * coefficientFilling;

        System.out.println("Объем стакана в милилитрах: " + glassVolume);
        System.out.println("Процент заполнения стакана: " + glassFillingPercentage + "%");
        System.out.println(actualGlassFilling + " милилитров в стакане, заполненом на " + glassFillingPercentage + "%");
    }
}

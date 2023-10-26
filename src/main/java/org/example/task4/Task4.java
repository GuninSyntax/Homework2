package org.example.task4;

/*
Стакан, который наполовину полон
 */

public class Task4 {
    public static void main(String[] args) {
        int glassVolume = 250;
        double glassFillingPercentage = 80;
        double actualGlassFilling = glassVolume / 100 * glassFillingPercentage;

        System.out.println("Объем стакана в милилитрах: " + glassVolume);
        System.out.println("Процент заполнения стакана: " + glassFillingPercentage + "%");
        System.out.println(actualGlassFilling + " милилитров в стакане, заполненом на " + glassFillingPercentage + "%");
    }
}

package main_tasks.Army;

/*
Саруман и Ланнистеры
 */

public class Army {
    public static void main(String[] args) {
        int numberOfLannisterSoldiers = 10000;
        int numberOfSarumanOrcs = 12000;
        int totalArms = numberOfLannisterSoldiers + numberOfSarumanOrcs;

        System.out.println("Количество пехотинцев у Ланнистеров: " + numberOfLannisterSoldiers);
        System.out.println("Количество орков в войске Сарумана: " + numberOfSarumanOrcs);
        System.out.println("Общее количество пехоты в союзе Ланнистеров и Сармана: " + totalArms);
    }
}

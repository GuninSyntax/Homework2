package main_tasks.Pinocchio;

/*
Буратино и яблоки
 */

public class Pinocchio {
    public static void main(String[] args) {
        int amountAppleOfPinocchio = 10;
        int takenAwayApples = 7;
        int leftoverApples = amountAppleOfPinocchio - takenAwayApples;

        System.out.println("У Буратино " + amountAppleOfPinocchio + " яблок");
        System.out.println("Карабас Барабас забрал у Буратино " + takenAwayApples + " яблок");
        System.out.println("У Буратино осталось " + leftoverApples + " яблока");
    }
}

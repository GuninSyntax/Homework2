package main_tasks.Age_comparison;

/*
Возраст Вселенной по сравнению с возрастом человечества
 */

public class AgeComparison {
    public static void main(String[] args) {
        long ageUniverse = 13_000_000_000L;
        long ageHumanity = 100_000L;
        long howManyTimesOlderUniverseThanPeople = ageUniverse / ageHumanity;

        System.out.println("Возраст вселенной (в годах): " + ageUniverse);
        System.out.println("Возраст человечества (в годах): " + ageHumanity);
        System.out.println("Во сколько раз вселенная старше человечества: " + howManyTimesOlderUniverseThanPeople);
    }
}

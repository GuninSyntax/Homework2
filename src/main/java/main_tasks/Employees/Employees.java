package main_tasks.Employees;

/*
Задача о количестве сотрудников на проекте
 */

public class Employees {
    public static void main(String[] args) {
        int developers = 10;
        int testersForOneDevelopers = 2;
        int supportsForQuestions = 3;
        int numberTestersForProject = developers * testersForOneDevelopers;
        int numberSupportsForProject = developers * supportsForQuestions;
        int numberAllSpecialists = developers + numberTestersForProject + numberTestersForProject;

        System.out.println("Количество программистов: " + developers);
        System.out.println("Количество тестировщиков, необходимое для обработки кода одного программиста: " + testersForOneDevelopers);
        System.out.println("Количество специалистов поддержки, необходимое для обработки вопросов, \n" +
                "возникающие у пользователей по поводу кода, написанного одним программистом " + supportsForQuestions);
        System.out.println("Общее количество тестировщиков на проекте: " + numberTestersForProject);
        System.out.println("Общее количество специалистов поддержки на проекте: " + numberSupportsForProject);
        System.out.println("Общее количество специалистов на проекте: " + numberAllSpecialists);
    }
}

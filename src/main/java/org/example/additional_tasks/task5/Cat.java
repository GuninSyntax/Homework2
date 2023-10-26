package org.example.additional_tasks.task5;

/*
- Скопировать код в проект при необходимости переименовать класс
- Найти 2 ошибки, подсказка - нужно сделать так чтобы заработала инкапсуляция
 */

public class Cat {

    // Поля класса должны быть приватными (реализация инкапсуляции)
    private String name;

    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Добавлен геттер и сеттер для поля weight
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}


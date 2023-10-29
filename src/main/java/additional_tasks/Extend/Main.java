package additional_tasks.Extend;

/*
- Создать абстрактный класс Animal, в классе Animal создать метод move() без реализации
- Создать классы Cat, Fish, Duck
- Наследовать классы Cat, Fish, Duck от Animal
- Реализовать метод move() в каждом из классов так чтобы он выводил в консоль "Я побежал" для кота, ""Я поплыла"" для рыбы, ""Я полетела"" для утки
 */

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Fish fish = new Fish();
        Duck duck = new Duck();

        cat.move();
        fish.move();
        duck.move();
    }
}

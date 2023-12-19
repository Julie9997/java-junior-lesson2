package ru.geekbrains.lesson2.hw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Animal[] animals =  {
                new Dog("Дружок", 3, "Овчарка"),
                new Cat("Васька", 1),
                new Dog("Шарик", 1, "Бигль"),
                new Cat("Снежок", 2)
        };

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - " + animal.getClass());
            Method method = animal.getClass().getMethod("makeSound");
            method.invoke(animal);
        }
    }
}

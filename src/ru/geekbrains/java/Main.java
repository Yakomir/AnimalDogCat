package ru.geekbrains.java;

import java.util.Scanner;
import java.util.Random;

//        1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия
//           (для бега и плавания), или высоту (для прыжков).
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
//        5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

public class Main
{
        public static void main(String[] args)
    {

        Cat cat = new Cat("Murzik",200,2,0);
        Dog dog = new Dog("Bobik",400,0.5f,10);
        Dog dog2 = new Dog("Tuzik",600,0.5f,10);

        System.out.println();

        Animal[] zoo = {cat, dog, dog2};

        for (int i = 0; i < zoo.length; i++)
        {
            zoo[i].run();
            zoo[i].jump();
            zoo[i].swim();
        }

        cat.run();
        cat.swim();
        cat.jump();
        System.out.println();

        dog.run();
        dog.swim();
        dog.jump();
        System.out.println();

        dog2.run();
        dog2.swim();
        dog2.jump();
        System.out.println();


    }

}

package ru.geekbrains.java;

import java.util.Random;

public class Cat extends Animal
{
    int cat_actual_run;
    int cat_actual_jump;

    public Cat(String name, int run, float jump, int swim)
    {
        super(name, run, jump, swim);
        this.cat_actual_run = 300 - random.nextInt(200);
        this.cat_actual_jump = 5 - random.nextInt(5);
    }


    public void jump()
    {
        //System.out.println(this.cat_actual_jump);
        if (this.cat_actual_jump <= jump)
        {
            System.out.println(name + ": подпрыгнул на " + this.cat_actual_jump + " метр(а-ов)");
        }
        else
        {
            System.out.println(name + ": не допрыгнул, высота оказалась слишком большой - " + this.cat_actual_jump + " метра(ов)");
        }
    }


    public void run()
    {
        //System.out.println(this.cat_actual_run);
        if (this.cat_actual_run <= run)
        {
            System.out.println(name + ": пробежал " + this.cat_actual_run + " метров.");
        }
        else
        {
            System.out.println(name + ": расстояние " + cat_actual_run + " метров оказалось слишком большим и " + name + " устал и не добежал.");
        }

    }

    public void swim()
    {
        System.out.println(name + ": не умеет плавать..");
    }


}

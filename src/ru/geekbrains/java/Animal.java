package ru.geekbrains.java;

import java.util.Random;

public abstract class Animal
{
    protected String name;
    protected int run;
    protected float jump;
    protected int swim;

    public Animal(String name, int run, float jump, int swim)
    {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    public static Random random = new Random();


}

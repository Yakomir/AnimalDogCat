package ru.geekbrains.java;

public class Dog extends Animal
{
    int dog_actual_run;
    double dog_actual_jump;
    int dog_actual_swim;

    public Dog(String name, int run, float jump, int swim) {
        super(name, run, jump, swim);
        this.dog_actual_run = random.nextInt(600) + 200;
        this.dog_actual_jump = Math.random()*1.25;
        this.dog_actual_swim = random.nextInt(14) + 1;
    }

    public void run()
    {
        //System.out.println(this.dog_actual_jump);
        //System.out.println(jump);
        //System.out.println(this.dog_actual_swim);

        if (this.dog_actual_run <= run)
        {
            System.out.println(name + ": пробежал " + dog_actual_run + " метров и не запыхался.");
        }
        else
        {
            System.out.println(name + ": путь " + dog_actual_run + " оказался слишком длинным, " + name + " устал и прилег отдохнуть.");
        }
    }

    void jump()
    {
        if (this.dog_actual_jump <= jump)
        {
            System.out.println(name + ": задумался и медленно подпрыгнул на высоту " + dog_actual_jump + " метров .... и не смог перескочить препятствие высотой 0,5 м.");
        }
        else
        {
            System.out.println(name + ": напрягся, подпрыгнул на высоту " + dog_actual_jump + " метров и энергично перескочил препятствие высотой 0,5 м.");
        }
    }

    void swim()
    {
        if (this.dog_actual_swim > swim)
        {
            System.out.println(name + ": умел хорошо плавать - как топор - и поэтому быстро поплыл на дно на глубину " + dog_actual_swim + " метров.");
        }
        else
        {
            System.out.println(name + ": брал уроки плавания у кота Матроскина и не напрягаясь проплыл " + dog_actual_swim + " метров.");
        }


    }
}

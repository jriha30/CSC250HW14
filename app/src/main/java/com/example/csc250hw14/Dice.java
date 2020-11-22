package com.example.csc250hw14;

import java.util.Random;

public class Dice
{
    private int numberOfSides;

    public Dice(int numberOfSides)
    {
        this.numberOfSides = numberOfSides;
    }

    public int rollDice()
    {
        Random r = new Random();
        return r.nextInt(this.numberOfSides) + 1;
    }

    public String display()
    {
        return "D" + this.numberOfSides;
    }
}
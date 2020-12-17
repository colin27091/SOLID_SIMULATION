package com.Interaction;

import java.util.Random;

public class RandomInteraction implements IInteraction{

    public RandomInteraction(){}

    @Override
    public int[] interact(int nbPerson) {
        int[] randomPair = new int[2];
        Random random = new Random();
        randomPair[0] = random.nextInt(nbPerson);
        int r = random.nextInt(nbPerson);
        while(r == randomPair[0]){
            r = random.nextInt(nbPerson);
        }
        randomPair[1] = r;
        return randomPair;
    }
}

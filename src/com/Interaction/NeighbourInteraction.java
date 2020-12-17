package com.Interaction;

import java.util.Random;

public class NeighbourInteraction implements IInteraction{

    public NeighbourInteraction() {}

    @Override
    public int[] interact(int nbPerson) {
        int[] pair = new int[2];
        Random random = new Random();
        pair[0] = random.nextInt(nbPerson);
        int second;
        if(pair[0] == nbPerson-1){
            pair[1] = 0;
        } else {
            pair[1] = pair[0] + 1;
        }
        return pair;
    }
}

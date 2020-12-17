package com.Distribution;

import java.util.*;

public class LoiNormale implements IDistribution{

    private float esperance;
    private float ecartType;

    public LoiNormale(float esperance, float ecartType) {
        this.esperance = esperance;
        this.ecartType = ecartType;
    }

    @Override
    public List<Float> distribution(int nbItems) {
        Random random = new Random();
        List<Float> richesses = new ArrayList<>();
        for(int i= 0; i < nbItems; i++){
            richesses.add((float) (random.nextGaussian()*ecartType+esperance));
        }
        return richesses;
    }



}

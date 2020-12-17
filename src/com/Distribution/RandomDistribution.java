package com.Distribution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDistribution implements IDistribution{

    private float min;
    private float max;

    public RandomDistribution(float min, float max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public List<Float> distribution(int nbItems) {
        Random random = new Random();
        List<Float> richesse = new ArrayList<>();
        for(int i =0; i < nbItems; i++){
            richesse.add(random.nextFloat()*(max-min)+min);
        }
        return richesse;
    }
}

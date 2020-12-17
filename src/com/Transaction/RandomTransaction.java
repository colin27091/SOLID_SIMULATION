package com.Transaction;

import java.util.List;
import java.util.Random;

public class RandomTransaction implements ITransaction{

    public RandomTransaction(){
    }

    @Override
    public List<Float> transact(List<Float> richesse, int[] pair) {
        Random random = new Random();
        float pot = richesse.get(pair[0]) + richesse.get(pair[1]);
        float first = random.nextFloat()*pot;
        float second = pot - first;
        richesse.set(pair[0], first);
        richesse.set(pair[1], second);
        return richesse;
    }
}

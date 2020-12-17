package com.Transaction;

import java.util.List;
import java.util.Random;

public class FullTransaction implements ITransaction{

    public FullTransaction() {
    }

    @Override
    public List<Float> transact(List<Float> richesse, int[] pair) {
        Random random = new Random();
        float pot = richesse.get(pair[0]) + richesse.get(pair[1]);
        for(int i : pair){
            richesse.set(i, (float) 0);
        }
        richesse.set(pair[random.nextInt(2)], pot);
        return richesse;
    }
}

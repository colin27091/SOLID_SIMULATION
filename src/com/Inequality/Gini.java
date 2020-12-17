package com.Inequality;

import java.util.Collections;
import java.util.List;

public class Gini implements IInequality{

    public Gini(){}

    @Override
    public float calculParam(List<Float> richesse) {
        Collections.sort(richesse);
        int n = richesse.size();
        float iyiSum = 0;
        float yiSum = 0;
        for(int i = 1; i<=n; i++){
            iyiSum += i*richesse.get(i-1);
            yiSum += richesse.get(i-1);
        }
        float G = ((2*iyiSum)/(n*yiSum))-((n+1)/n);
        return G;
    }
}

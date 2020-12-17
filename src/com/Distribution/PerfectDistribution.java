package com.Distribution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PerfectDistribution implements IDistribution{

    private float defaultRichesse;

    public PerfectDistribution(float defaultRichesse) {
        this.defaultRichesse = defaultRichesse;
    }

    @Override
    public List<Float> distribution(int nbItems) {
        List<Float> richesses = new ArrayList<>();
        for (int i = 0; i < nbItems; i++) {
            richesses.add(this.defaultRichesse);
        }
        return richesses;
    }
}

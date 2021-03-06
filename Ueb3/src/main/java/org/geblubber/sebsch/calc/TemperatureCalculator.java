package org.geblubber.sebsch.calc;

import java.util.ArrayList;
import java.util.Collections;


public class TemperatureCalculator {

    private ArrayList<Integer> listOfValues;

    public TemperatureCalculator(ArrayList<Integer> listOfValues) {
        this.listOfValues = listOfValues;
    }

    public double avg() {
        int n = 0;
        for (Integer value : listOfValues) {
            n += value;
        }
        return n / listOfValues.size();
    }

    public int min() {
        return Collections.min(listOfValues);
    }

    public int max() {
        return Collections.max(listOfValues);
    }
}

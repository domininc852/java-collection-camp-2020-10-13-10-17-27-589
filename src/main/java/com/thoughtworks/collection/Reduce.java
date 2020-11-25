package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
       return arrayList.stream().mapToDouble(Double::valueOf).reduce(0,Double::sum)/arrayList.size();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(0,(max,a)->a>max?a:max);
    }

    public int getLastOdd() {
        return arrayList.stream().reduce(0,(lastOdd,a)->a%2==1?a:lastOdd);
    }
}

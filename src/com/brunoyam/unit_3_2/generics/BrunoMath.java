package com.brunoyam.unit_3_2.generics;

public final class BrunoMath<T extends Number> {

    private BrunoMath() {}


    public BrunoMath<T> sum(T[] values) {
        return this.sum(values);
    }

    public BrunoMath<T> max(int a, int b) {
        return this.max(a, b);
    }

//    public static int max(int[] values) {
//        if (values.length == 0) return 0;
//
//        return this.max();
//    }

    public BrunoMath<T> avg(T[] values) {
//        if (values.length == 0) return null;
//
//        BrunoMath<T> sum = sum(values);
        return this.avg(values);
  }

}

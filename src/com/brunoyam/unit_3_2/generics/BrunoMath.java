package com.brunoyam.unit_3_2.generics;

public final class BrunoMath<T> {

    private BrunoMath() {}


    public BrunoMath<T> sum(T[] values) {
        BrunoMath<T> result = new BrunoMath<>();
        for(T value : values) {
            result = (BrunoMath<T>) value;
        }
        return result;
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int[] values) {
        if (values.length == 0) return 0;

        int result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return result;
    }

    public BrunoMath<T> avg(T[] values) {
        if (values.length == 0) return null;

        BrunoMath<T> sum = sum(values);
        return sum / values.length;
    }

}

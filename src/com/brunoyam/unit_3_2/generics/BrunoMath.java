package com.brunoyam.unit_3_2.generics;

public final class BrunoMath<T> extends Number {

    T number1;
    T number2;

    private BrunoMath() {
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }


    public BrunoMath<T> sum(T[] values) {
        BrunoMath<T> result = new BrunoMath<>();
        for (T value : values) {
            result = (BrunoMath<T>) value;
        }
        return result;
    }

    private T max(T a, T b) {
        number1 = a;
        number2 = b;
        return number1 > number2 ? a : b;
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

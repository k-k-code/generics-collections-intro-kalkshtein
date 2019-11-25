package com.brunoyam.unit_3_2.generics;

public final class BrunoMath {

    private BrunoMath() {}

    public static int sum(int[] values) {
        int result = 0;
        for(int value : values) {
            result += value;
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

    public static double avg(int[] values) {
        if (values.length == 0) return 0;

        double sum = sum(values);
        return sum / values.length;
    }

}

package com.brunoyam.unit_3_2.generics;

public final class Price {

    private final String vendoreCode;
    private final Integer value;

    public Price(String vendoreCode, Integer value) {
        this.vendoreCode = vendoreCode;
        this.value = value;
    }

    public String getVendoreCode() {
        return vendoreCode;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return vendoreCode + " = " + value.toString();
    }
}

package com.brunoyam.unit_3_2.bruno.collections;

class QueueValue<T> {

    private T value;
    private QueueValue prevValue;
    private QueueValue nextValue;

    public QueueValue(T value) {
        this.value = value;
    }

    public QueueValue(T value, QueueValue prevValue) {
        this(value);
        this.prevValue = prevValue;
    }

    public T getValue() {
        return value;
    }

    public QueueValue getPrevValue() {
        return prevValue;
    }

    public QueueValue getNextValue() {
        return nextValue;
    }

    public void setNextValue(QueueValue nextValue) {
        this.nextValue = nextValue;
    }

    public void setPrevValue(QueueValue prevValue) {
        this.prevValue = prevValue;
    }
}

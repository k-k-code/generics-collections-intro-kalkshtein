package com.brunoyam.unit_3_2.bruno.collections;

import java.util.Iterator;

public class BrunoQueue<T> implements Iterable<T> {

    private static String COLLECTION_NAME = "Iterable bruno queue";

    public static String getCollectionName() {
        return COLLECTION_NAME;
    }

    private QueueValue<T> nextValue;
    private QueueValue<T> lastValue;

    public void add(T value) {
        if (lastValue == null) {
            QueueValue<T> newValue = new QueueValue(value);
            nextValue = newValue;
            lastValue = newValue;
        } else {
            QueueValue<T> newValue = new QueueValue(value, lastValue);
            lastValue.setNextValue(newValue);
            lastValue = newValue;
        }
    }

    public T get() {
        if(nextValue == null) {
            return null;
        }
        QueueValue<T> result = nextValue;

        if (nextValue == lastValue) {
            nextValue = null;
            lastValue = null;
        } else {
            nextValue = nextValue.getNextValue();
        }

        return result.getValue();
    }

    QueueValue viewFirst() {
        return nextValue;
    }

    @Override
    public Iterator<T> iterator() {
        return new QueueIterator<T>(this);
    }
}

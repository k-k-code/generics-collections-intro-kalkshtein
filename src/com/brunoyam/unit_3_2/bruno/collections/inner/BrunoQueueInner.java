package com.brunoyam.unit_3_2.bruno.collections.inner;

import java.util.Iterator;

public class BrunoQueueInner<T> implements Iterable<T>{

    private static String COLLECTION_NAME = "Iterable bruno queue";

    public static String getCollectionName() {
        return COLLECTION_NAME;
    }

    /* Объявите внутренний класс QueueValues использовать его в качестве типа полей nextValue и lastValue

    private static class QueueValue<T> { }
     */

    /* Объявите внутренний класс QueueIterator использовать его в качестве итератора

    private class QueueIterator<T> implements Iterator<T> { }
     */

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
        //TODO: создать новый итератор и вернуть его.
    }

}

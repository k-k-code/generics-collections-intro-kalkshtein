package com.brunoyam.unit_3_2.bruno.collections;

import java.util.Iterator;

class QueueIterator<T> implements Iterator<T> {

    private QueueValue<T> currentValue;

    public QueueIterator(BrunoQueue collection) {
        collection = collection;
        currentValue = collection.viewFirst();
    }

    @Override
    public boolean hasNext() {
        return currentValue != null;
    }

    @Override
    public T next() {
        QueueValue<T> result = currentValue;
        currentValue = currentValue.getNextValue();
        return result.getValue();
    }

    @Override
    public void remove() {
        if(currentValue == null) throw new IllegalStateException();
        QueueValue<T> prevValue = currentValue.getPrevValue();
        if(prevValue != null) prevValue.setNextValue(currentValue.getNextValue());
        QueueValue<T> nextValue = currentValue.getNextValue();
        if(nextValue != null) nextValue.setPrevValue(currentValue.getPrevValue());
        currentValue = currentValue.getNextValue();
    }
}

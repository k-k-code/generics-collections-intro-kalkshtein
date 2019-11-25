package com.brunoyam.unit_3_2.tasks;

import com.brunoyam.unit_3_2.bruno.collections.inner.BrunoQueueInner;

import java.util.Iterator;

public class Level3 implements Task{
    @Override
    public void run() {
        BrunoQueueInner<String> ducksQueue = new BrunoQueueInner<>();

        ducksQueue.add("Huey");
        ducksQueue.add("Dewey");
        ducksQueue.add("Louie");
        ducksQueue.add("Webby");

        Iterator<String> iter = ducksQueue.iterator();

        iter.next();
        iter.remove();
        iter.next();
        iter.next();
        iter.remove();

        System.out.println("Level 3:");
        for (String duck : ducksQueue) {
            System.out.println(duck);
        }
    }
}

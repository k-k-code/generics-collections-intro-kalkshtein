package com.brunoyam.unit_3_2.tasks;

import com.brunoyam.unit_3_2.bruno.collections.BrunoQueue;

import java.util.Iterator;

public class Level2 implements Task {
    @Override
    public void run() {

        BrunoQueue<String> ducksQueue = new BrunoQueue<>();

        ducksQueue.add("Huey");
        ducksQueue.add("Dewey");
        ducksQueue.add("Louie");
        ducksQueue.add("Webby");

        Iterator<String> iter = ducksQueue.iterator();

        iter.next();
        iter.next();
        iter.remove();
        iter.next();
        iter.remove();

        System.out.println("Level 2:");
        for (String duck : ducksQueue) {
            System.out.println(duck);
        }

    }
}

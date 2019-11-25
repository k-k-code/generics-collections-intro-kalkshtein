package com.brunoyam.unit_3_2;

import com.brunoyam.unit_3_2.tasks.Level1;
import com.brunoyam.unit_3_2.tasks.Level2;
import com.brunoyam.unit_3_2.tasks.Level3;
import com.brunoyam.unit_3_2.tasks.Task;

public class Application {

    private static final Task[] tasks = {
            new Level1(),
            new Level2(),
            new Level3()
        };

	public static void main(String[] args) {

        for(Task task : tasks) {
            task.run();
        }
	}

}

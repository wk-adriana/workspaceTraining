package com.training.example;

import com.training.annotation.Author;
import com.training.annotation.ExecutionPriority;
import com.training.annotation.PrintPriority;
import com.training.annotation.Test;

/**
 * Created by dbati on 13.07.2016.
 */
@Author(createdBy = "Dmitri", priority = Author.Priority.MEDIUM, tags = {"Grads", "Training"})
@ExecutionPriority(priority = ExecutionPriority.Priority.LOW)
public class TestExample1 {

    @PrintPriority()
    public void print() {
        System.out.println("Priority " + ExecutionPriority.Priority.LOW);
    }
    @Test(enabled = false)
    public void testB() {
        if (false)
            throw new RuntimeException("This test always passed");
    }

    @Test(enabled = true)
    public void testC() {
        if (10 > 1) {
            // do nothing, this test always passed.
        }
    }

    @Test
    public void testA() {
        if(true) {
            throw new RuntimeException("This test always failed");
        }
    }

}

package com.example.execution;

import java.util.concurrent.TimeUnit;

public class GreetingExecution {
    public void doGreeting(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello how are you");
    }
}

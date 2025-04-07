package com.example.task;

import com.example.execution.UserAddExecution;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class UserAddTask implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("new task");
        final var s = new UserAddExecution().addUser();
        System.out.println(s);
    }
}

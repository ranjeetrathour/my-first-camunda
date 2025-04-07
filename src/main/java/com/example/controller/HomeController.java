package com.example.controller;

import jakarta.annotation.PostConstruct;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    public RuntimeService runtimeService;

    @GetMapping
    public ResponseEntity<?> home(){
        return ResponseEntity.status(HttpStatus.OK).body("welcome");
    }


    @PostConstruct
    public void startCamundaExecution() {
        var processInstance = runtimeService.createProcessInstanceByKey("my_work_flow");
        processInstance.executeWithVariablesInReturn();
    }
}

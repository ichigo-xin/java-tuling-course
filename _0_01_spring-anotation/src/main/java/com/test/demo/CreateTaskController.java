package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateTaskController {

    @Autowired
    private CreateTask createTask;

    @RequestMapping("/hello")
    public String createTask() {
        return createTask.test();
    }
}

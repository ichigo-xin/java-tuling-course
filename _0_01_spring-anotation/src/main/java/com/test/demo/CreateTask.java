package com.test.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
//@AllArgsConstructor
@RequiredArgsConstructor
public class CreateTask {

    private final TaskManageMonitorService taskManageMonitorService;

    @Value("${create.task}")
    private boolean createTaskFlag;

    public String test() {
        if (createTaskFlag) {
            return "Create Task";
        } else {
            return "Do not create Task";
        }
    }
}

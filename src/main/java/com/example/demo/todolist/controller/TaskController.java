package com.example.demo.todolist.controller;

import com.example.demo.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/task")
@CrossOrigin("*")
public class TaskController {
    @Autowired
    @Qualifier("taskServiceImpl")
    private TaskService taskService;

    @GetMapping("/get-all")
    public ResponseEntity getAll() {
        return taskService.getAll();
    }
}

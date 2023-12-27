package com.example.demo.todolist.service;

import com.example.demo.todolist.entities.TaskEntity;
import com.example.demo.todolist.repository.TaskRepository;
import com.example.demo.todolist.response.TaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public ResponseEntity getAll() {
        List<TaskEntity> list = taskRepository.getAll();
        List<TaskResponse> taskResponses = list.stream().map(o -> Helper.convertEntityToResponse(o)).collect(Collectors.toList());
        return ResponseEntity.ok(taskResponses);
    }
}

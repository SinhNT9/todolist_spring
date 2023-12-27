package com.example.demo.todolist.repository;

import com.example.demo.todolist.entities.TaskEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository {
    List<TaskEntity> getAll();
}

package com.example.demo.todolist.service;

import com.example.demo.todolist.entities.TaskEntity;
import com.example.demo.todolist.response.TaskResponse;
import com.example.demo.todolist.utils.StatusEnum;

public class Helper {
    public static TaskResponse convertEntityToResponse(TaskEntity taskEntity) {
        TaskResponse taskResponse = new TaskResponse();
        taskResponse.setId(taskEntity.getId());
        taskResponse.setName(taskEntity.getName());
        taskResponse.setDeadline(taskEntity.getDeadline());
        taskResponse.setStatus(StatusEnum.getStatusEnumByValue(taskEntity.getStatus()));
        taskResponse.setCreatedAt(taskEntity.getCreatedAt());
        taskResponse.setCreatedBy(taskEntity.getCreatedBy());
        taskResponse.setUpdatedAt(taskEntity.getUpdatedAt());
        taskResponse.setUpdatedBy(taskEntity.getUpdatedBy());
        taskResponse.setIsDeleted(taskEntity.getIsDeleted());
        return taskResponse;
    }
}

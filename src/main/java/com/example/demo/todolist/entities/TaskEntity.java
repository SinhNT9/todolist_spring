package com.example.demo.todolist.entities;

import com.example.demo.todolist.utils.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TaskEntity extends BaseEntity {
    private Integer id;
    private String name;
    private LocalDateTime deadline;
    private Integer status;
}

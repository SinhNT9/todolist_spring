package com.example.demo.todolist.response;

import com.example.demo.todolist.utils.BaseEntity;
import com.example.demo.todolist.utils.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TaskResponse extends BaseEntity {
    private Integer id;
    private String name;
    private LocalDateTime deadline;
    private StatusEnum status;
}

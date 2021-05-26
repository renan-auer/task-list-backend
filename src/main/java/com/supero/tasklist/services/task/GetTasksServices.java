package com.supero.tasklist.services.task;

import java.util.List;

import com.supero.tasklist.models.Task;
import com.supero.tasklist.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GetTasksServices {

    private final TaskRepository taskRepository;

    @Autowired
    public GetTasksServices(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> get() throws Exception {
        List<Task> tasks = this.taskRepository.findAll();
        return tasks;
    }
}

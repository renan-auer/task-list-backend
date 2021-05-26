package com.supero.tasklist.services.task;

import com.supero.tasklist.models.Task;
import com.supero.tasklist.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreateTaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public CreateTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task create(Task task) throws Exception {
        Task taskCreated = this.taskRepository.save(task);
        return taskCreated;
    }
}

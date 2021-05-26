package com.supero.tasklist.services.task;

import com.supero.tasklist.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeleteTaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public DeleteTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public boolean delete(int id) throws Exception {
        this.taskRepository.deleteById(id);
        return true;
    }
}

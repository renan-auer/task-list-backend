package com.supero.tasklist.services.task;

import com.supero.tasklist.models.Task;
import com.supero.tasklist.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UpdateTaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public UpdateTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task update(int id, Task task) throws Exception {
        Task taskToUpdate = this.taskRepository.findById(id).orElse(null);
        
        if(taskToUpdate == null) {
            return null;
        }

        taskToUpdate.setTitle(task.getTitle());
        taskToUpdate.setDescription(task.getDescription());
        taskToUpdate.setStatus(task.getStatus());
        this.taskRepository.save(taskToUpdate);
        return taskToUpdate;
    }
}

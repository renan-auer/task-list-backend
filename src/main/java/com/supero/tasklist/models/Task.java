package com.supero.tasklist.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.supero.tasklist.models.dto.TaskDTO;
import com.supero.tasklist.models.enums.StatusEnum;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private StatusEnum status;
    private String description;
    private String title;


    public Task(TaskDTO taskDTO) {
        this.description = taskDTO.getDescription();
        this.status = taskDTO.getStatus();
        this.title = taskDTO.getTitle();
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public StatusEnum getStatus() {
        return this.status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }


    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}

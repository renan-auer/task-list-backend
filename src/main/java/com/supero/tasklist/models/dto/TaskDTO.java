package com.supero.tasklist.models.dto;

import com.supero.tasklist.models.enums.StatusEnum;

public class TaskDTO {

    private StatusEnum status;
    private String description;
    private String title;

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

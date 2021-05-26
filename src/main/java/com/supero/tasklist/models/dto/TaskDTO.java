package com.supero.tasklist.models.dto;

import javax.validation.constraints.NotBlank;

public class TaskDTO {

    @NotBlank(message = "{status.not.empty}")
    private String status;

    @NotBlank(message = "{description.not.empty}")
    private String description;

    @NotBlank(message = "{title.not.empty}")
    private String title;

    

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
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

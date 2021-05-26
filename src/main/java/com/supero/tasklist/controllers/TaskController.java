package com.supero.tasklist.controllers;


import com.supero.tasklist.models.ErrorResponse;
import com.supero.tasklist.models.Task;
import com.supero.tasklist.services.task.CreateTaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "task", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class TaskController {

  private final CreateTaskService createTaskService;

  @Autowired
  public TaskController(
      CreateTaskService createTaskService
      ) {
    this.createTaskService = createTaskService;
  }
  @PostMapping
  public ResponseEntity<?> create(@RequestBody Task task) {
    try {
      Task taskCreated = this.createTaskService.create(task);
      return new ResponseEntity<Task>(taskCreated, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<ErrorResponse>(new ErrorResponse(e.getMessage()), HttpStatus.OK); 
    }

  }

}

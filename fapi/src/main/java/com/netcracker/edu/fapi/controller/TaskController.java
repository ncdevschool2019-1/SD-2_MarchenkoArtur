package com.netcracker.edu.fapi.controller;
import com.netcracker.edu.fapi.models.Task;
import com.netcracker.edu.fapi.service.TaskService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Task> getTask() {
        List<Task> list = new ArrayList<>();
        list.add(new Task());
        list.add(new Task());
        return list;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Task> saveTasks(@RequestBody Task billingTask) {
        if (billingTask != null) {
            return ResponseEntity.ok(taskService.saveTasks(billingTask));
        }
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteTask(@PathVariable String id) {
        taskService.deleteTask(Long.valueOf(id));
    }

}

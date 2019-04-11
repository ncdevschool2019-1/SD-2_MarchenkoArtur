package com.netcracker.edu.fapi.service;
import com.netcracker.edu.fapi.models.Task;
import java.util.List;

public interface TaskService {
    List<Task> getTask();
    Task saveTasks(Task task);
    void deleteTask(Long id);
}

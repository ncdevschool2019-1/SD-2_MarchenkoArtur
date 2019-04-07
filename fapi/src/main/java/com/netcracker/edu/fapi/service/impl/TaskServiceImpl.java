package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.BillingAccountViewModel;
import com.netcracker.edu.fapi.models.Task;
import com.netcracker.edu.fapi.service.BillingAccountDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.netcracker.edu.fapi.service.TaskService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Value("${backend.server.url}")
    private String backendServerUrl;


    @Override
    public List<Task> getTask(String type) {
        RestTemplate restTemplate = new RestTemplate();
        Task[] catalogViewModelsResponse = restTemplate.getForObject(backendServerUrl + "api/task/" + type, Task[].class);
        return catalogViewModelsResponse == null ? Collections.emptyList() : Arrays.asList(catalogViewModelsResponse);
    }
}

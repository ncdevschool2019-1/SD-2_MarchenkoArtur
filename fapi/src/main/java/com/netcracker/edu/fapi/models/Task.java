package com.netcracker.edu.fapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Task {
    private int id;
    private  String ticket_code;
    private  String description;
    private  String priority;
    private  String created_data;
    private  String due_data;
    private int estimation;
    private  String user;
    private  String status;

    public Task(){
        id=5;
        ticket_code="XXX-001";
        description="qwer";
        priority="Medium";
        created_data="06.04.2019";
        due_data="08.04.2019";
        estimation=1;
        user="Marchenko";
        status="Opened";

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicket_code() {
        return ticket_code;
    }

    public void setTicket_code(String ticket_code) {
        this.ticket_code = ticket_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCreated_data() {
        return created_data;
    }

    public void setCreated_data(String created_data) {
        this.created_data = created_data;
    }

    public String getDue_data() {
        return due_data;
    }

    public void setDue_data(String due_data) {
        this.due_data = due_data;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

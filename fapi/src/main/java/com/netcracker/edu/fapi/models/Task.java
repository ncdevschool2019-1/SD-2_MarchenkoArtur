package com.netcracker.edu.fapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Task {
    private int id;
    private  String ticket_code;
    private  String description;
    private  String created_date;
    private  String due_data;
    private  String estimation;
    private  String user_id;
    private  String status_id;
    private Priority priority;

    public Task(){

    }
    public Task(int id, String ticket_code, String description, String priority_id, String created_date, String due_data, String estimation, String user_id, String status_id) {
        this.id = id;
        this.ticket_code = ticket_code;
        this.description = description;
        this.created_date = created_date;
        this.due_data = due_data;
        this.estimation = estimation;
        this.user_id = user_id;
        this.status_id = status_id;
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

    public String getcreated_date() {
        return created_date;
    }

    public void setcreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getDue_data() {
        return due_data;
    }

    public void setDue_data(String due_data) {
        this.due_data = due_data;
    }

    public String getEstimation() {
        return estimation;
    }

    public void setEstimation(String estimation) {
        this.estimation = estimation;
    }

    public String getuser_id() {
        return user_id;
    }

    public void setuser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getstatus_id() {
        return status_id;
    }

    public void setstatus_id(String status_id) {
        this.status_id = status_id;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}

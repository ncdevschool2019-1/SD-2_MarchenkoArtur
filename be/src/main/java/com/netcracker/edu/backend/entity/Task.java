package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ticket_code;
    private String description;
    private int priority_id;
    private String created_date;
    private String due_data;
    private int user_id;
    private String estimation;
    private int status_id;

    public Task(){

    }

    public Task(String ticket_code, String description, int priority_id, String created_date, String due_data, int user_id, String estimation, int status_id) {
        this.ticket_code = ticket_code;
        this.description = description;
        this.priority_id = priority_id;
        this.created_date = created_date;
        this.due_data = due_data;
        this.user_id = user_id;
        this.estimation = estimation;
        this.status_id=status_id;
    }

    public int getId() {
        return id;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
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

    public int getPriority_id() {
        return priority_id;
    }

    public void setPriority_id(int priority_id) {
        this.priority_id = priority_id;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getDue_data() {
        return due_data;
    }

    public void setDue_data(String due_data) {
        this.due_data = due_data;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getEstimation() {
        return estimation;
    }

    public void setEstimation(String estimation) {
        this.estimation = estimation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id &&
                priority_id == task.priority_id &&
                user_id == task.user_id &&
                Objects.equals(ticket_code, task.ticket_code) &&
                Objects.equals(description, task.description) &&
                Objects.equals(created_date, task.created_date) &&
                Objects.equals(due_data, task.due_data) &&
                Objects.equals(estimation, task.estimation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ticket_code, description, priority_id, created_date, due_data, user_id, estimation);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", ticket_code='" + ticket_code + '\'' +
                ", description='" + description + '\'' +
                ", priority_id=" + priority_id +
                ", created_date='" + created_date + '\'' +
                ", due_data='" + due_data + '\'' +
                ", user_id=" + user_id +
                ", estimation='" + estimation + '\'' +
                '}';
    }
}

package com.netcracker.edu.fapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Priority {
    private int priority_id;
    private String priority;

    public Priority() {
    }

    public int getPriority_id() {
        return priority_id;
    }

    public void setPriority_id(int priority_id) {
        this.priority_id = priority_id;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Priority priority1 = (Priority) o;
        return priority_id == priority1.priority_id &&
                Objects.equals(priority, priority1.priority);
    }

    @Override
    public int hashCode() {

        return Objects.hash(priority_id, priority);
    }

    @Override
    public String toString() {
        return "Priority{" +
                "priority_id=" + priority_id +
                ", priority='" + priority + '\'' +
                '}';
    }
}

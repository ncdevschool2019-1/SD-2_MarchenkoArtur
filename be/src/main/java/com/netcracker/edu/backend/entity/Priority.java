package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "priority")
public class Priority {
    @Id
    @Column(name = "priority_id")
    private int priority_id;
    @Column(name="priority")
    private  String priority;

    @OneToMany(mappedBy = "priority")
    private List<Task> tasks=new ArrayList<Task>();

    public Priority() {
    }

    public Priority(int priority_id, String priority) {
        this.priority_id = priority_id;
        this.priority = priority;
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

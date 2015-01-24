package com.freelance.dao.entity;

import java.util.Date;

/**
 * Created by user on 24.01.15.
 */
public class Task implements Comparable<Task>{
    private long id;
    private String description;
    private Date deadline;

    public Task() {
        description="";
        deadline = new Date();
    }

    public Task(String description, Date deadline) {
        this.description = description;
        this.deadline = deadline;
    }

    public Task(long id, String description, Date deadline) {
        this.id = id;
        this.description = description;
        this.deadline = deadline;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public int compareTo(Task o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

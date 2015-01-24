package com.freelance.dao.entity;

import java.util.Date;

/**
 * Created by user on 24.01.15.
 */
public class Task {
    private long id;
    private String description;
    private Date deadline;

    public Task() {
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

}

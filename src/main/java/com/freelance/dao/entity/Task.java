package com.freelance.dao.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by user on 24.01.15.
 */
@Entity
@Table(name = "Task")
public class Task implements Comparable<Task> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "description")
    private String description;
    @Column(name = "deadline")
    private Date deadline;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;

    public Task() {
        description = "";
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

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
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

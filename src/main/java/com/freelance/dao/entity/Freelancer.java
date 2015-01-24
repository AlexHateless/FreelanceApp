package com.freelance.dao.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 24.01.15.
 */
public class Freelancer implements Comparable<Freelancer> {
    private long id;
    private String firstName;
    private String lastname;
    private List<Task> tasks;

    public Freelancer() {
        firstName = "";
        lastname = "";
        tasks = new ArrayList();
    }

    public Freelancer(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
        tasks = new ArrayList();
    }

    public Freelancer(long id, String firstName, String lastname) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        tasks = new ArrayList();
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Freelancer that = (Freelancer) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public int compareTo(Freelancer o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

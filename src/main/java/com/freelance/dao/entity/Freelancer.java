package com.freelance.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 24.01.15.
 */
@Entity
@Table(name = "Freelancer")
public class Freelancer implements Comparable<Freelancer> {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastname;
    @OneToMany(mappedBy = "freelancer")
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

    @Override
    public String toString() {
        return "Freelancer{" +
                "lastname='" + lastname + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}

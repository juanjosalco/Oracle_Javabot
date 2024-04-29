package com.talentpentagon.javabot.model;

import jakarta.persistence.*;

import lombok.Data;
import java.util.List;

@Entity
@Table(name="staff")
@Data
public class CustomUser {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "team_id")
    private int teamId;

    @Column(name = "role")
    private String role;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "phonenumber")
    private String phonenumber;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "assignee_id")
    private List<TaskItem> assignedTasks;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public List<TaskItem> getAssignedTasks() {
        return assignedTasks;
    }

    public CustomUser() {
    }

    public CustomUser(int teamId, String password, String role, String firstname, String lastname, String phonenumber) {
        this.teamId = teamId;
        this.role = role;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
    }
}

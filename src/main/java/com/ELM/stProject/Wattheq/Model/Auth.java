package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Auth")
@Table
public class Auth {


    @Column(name = "AuthID")
    private int authID;
    @Id
    @Column(name = "AuthName")
    private String authName;
    @Column(name = "AuthDescription")
    private String authDescription;

    @OneToMany(mappedBy = "auth" , cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();


    public Auth() {}

    public Auth(int authID, String authName, String authDescription) {
        this.authID = authID;
        this.authName = authName;
        this.authDescription = authDescription;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getAuthID() {
        return authID;
    }

    public void setAuthID(int authID) {
        this.authID = authID;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getAuthDescription() {
        return authDescription;
    }

    public void setAuthDescription(String authDescription) {
        this.authDescription = authDescription;
    }

    public void setNationalID(int authID) {
    }



}



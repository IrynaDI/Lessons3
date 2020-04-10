package com.company;

import java.util.List;
import java.util.Scanner;

public class AddUser {

    private List<String> roles;
    private String r;

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }


    public void addUser(User user) throws Exception {
        if (roles == null) {
            for (String r : roles) {
            }
            this.roles.add(r);
        }


    }
    }

package com.company;

public class User {
    private String login;
    private String password;
    private String Username;
    private String UserLastname;

    public User() {
        super();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUserLastname() {
        return UserLastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", Username='" + Username + '\'' +
                ", UserLastname='" + UserLastname + '\'' +
                '}';
    }

    public void setUserLastname(String userLastname) {
        UserLastname = userLastname;

    }
}


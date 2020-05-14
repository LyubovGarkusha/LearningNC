package com.netcracker.fapi.entity;


public class Login {
    private long id;
    private String password;
    private String email;
    private User user;

    public Login(long id, String password, String email, User user) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.user = user;
    }

    public Login(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

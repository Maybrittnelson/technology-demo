package com.netease.meta;

public class User {
    private int id;
    private int userId;
    private String userName;
    private String password;

    public User(int id, int userId, String userName) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    private void init() {
        System.out.println("女娲造人开启");
    }

    private void destroy() {
        System.out.println("女娲收人");
    }
}

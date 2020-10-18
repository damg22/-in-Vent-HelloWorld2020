package com.example.invent2020;

public class Player {
    private String color;
    private String userID;
    private String role;
    private String[] currentTaskList = new String[3];

    public Player(String color, String userID, String role) {
        this.color = color;
        this.userID = userID;
        this.role = role;
    }


}

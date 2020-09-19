package com.guestbook.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GuestBook {
    private int id;
    private String name;
    private String message;
    private String date;

    public GuestBook() {
        this.date = getStrDate();
    }

    public GuestBook(String name, String message) {
        this.name = name;
        this.message = message;
        this.date = getStrDate();
    }

    public GuestBook(int id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.date = getStrDate();
    }

    public GuestBook(int id, String name, String message, String date) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.date = date;
    }

    private String getStrDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        return formatter.format(date);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }
}

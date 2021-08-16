package com.messengerapp.demo.messengerapp.models;

import com.sun.javafx.geom.transform.Identity;

import javax.persistence.*;

@Entity(name = "messages")
public class MessageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String messageContent;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String chatId;

    public MessageModel(String messageContent, String date, String chatId) {
        this.messageContent = messageContent;
        this.date = date;
        this.chatId = chatId;
    }

    public MessageModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }
}

package com.messengerapp.demo.messengerapp.models;

public class ChatModel {
    private int chatId;
    private String imageUrl;
    private String name;
    private String lastMessage;

    private int senderId;
    private int receiverId;

    public ChatModel() {
    }

    public ChatModel(int chatId, String imageUrl, String name, String lastMessage) {
        this.chatId = chatId;
        this.imageUrl = imageUrl;
        this.name = name;
        this.lastMessage = lastMessage;
    }


    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}

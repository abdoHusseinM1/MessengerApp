package com.messengerapp.demo.messengerapp.utils;

public class DataResponse {

    int status;
    String message;
    Object data;

    public DataResponse(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}

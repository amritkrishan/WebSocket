package com.websocket.websocket.model;

public class EmployeeResponse {

    String content;

    public EmployeeResponse() {
    }

    public EmployeeResponse(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}

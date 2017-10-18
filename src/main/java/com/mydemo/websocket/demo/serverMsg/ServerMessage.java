package com.mydemo.websocket.demo.serverMsg;

import org.springframework.beans.factory.annotation.Autowired;

public class ServerMessage {
    private String content;

    @Autowired
    public ServerMessage() {
    }

    public ServerMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

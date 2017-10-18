package com.mydemo.websocket.demo.controller;

import com.mydemo.websocket.demo.clientMsg.ClientMessage;
import com.mydemo.websocket.demo.serverMsg.ServerMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @MessageMapping("/hello")
    @SendTo("/topic/server")
    public ServerMessage hello(ClientMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new ServerMessage("Hello, echo:" + message.getContent() + "!");
    }

}

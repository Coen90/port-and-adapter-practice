package jpabasic.portandadapterpractice.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketController {
    @MessageMapping("/hello")
    public void greeting(String message) {
        System.out.println("Received message: " + message);
    }

}
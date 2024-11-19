package jpabasic.portandadapterpractice.chat.adapter.out.websocket;

import jpabasic.portandadapterpractice.chat.application.port.out.WebSocketPort;
import jpabasic.portandadapterpractice.chat.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class WebSocketSenderAdapter implements WebSocketPort {
    private final SimpMessagingTemplate simpMessagingTemplate;

    @Override
    public void sendMessageToRoom(Message message) {
        simpMessagingTemplate.convertAndSend("/topic/room/" + message.getRoomId(), message);
    }
}

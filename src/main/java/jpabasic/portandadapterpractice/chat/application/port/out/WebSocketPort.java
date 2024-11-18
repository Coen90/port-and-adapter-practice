package jpabasic.portandadapterpractice.chat.application.port.out;

import jpabasic.portandadapterpractice.chat.domain.Message;

public interface WebSocketPort {
    void sendMessageToRoom(Message message);
}

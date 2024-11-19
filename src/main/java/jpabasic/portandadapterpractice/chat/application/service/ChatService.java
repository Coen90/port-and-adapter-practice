package jpabasic.portandadapterpractice.chat.application.service;

import jpabasic.portandadapterpractice.chat.application.port.in.CommandChatUseCase;
import jpabasic.portandadapterpractice.chat.application.port.out.CommandChatPort;
import jpabasic.portandadapterpractice.chat.application.port.out.WebSocketPort;
import jpabasic.portandadapterpractice.chat.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService implements CommandChatUseCase {
    private final CommandChatPort commandChatPort;
    private final WebSocketPort webSocketPort;

    @Override
    public Message sendMessage(Long roomId, String content) {
        Message sendMessage = Message.of(null, content, roomId);
        Message message = commandChatPort.createMessage(sendMessage);
        webSocketPort.sendMessageToRoom(message);
        return message;
    }
}

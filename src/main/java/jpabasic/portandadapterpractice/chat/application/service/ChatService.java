package jpabasic.portandadapterpractice.chat.application.service;

import jpabasic.portandadapterpractice.chat.application.port.in.CommandChatUseCase;
import jpabasic.portandadapterpractice.chat.application.port.out.CommandChatPort;
import jpabasic.portandadapterpractice.chat.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService implements CommandChatUseCase {
    private final CommandChatPort commandChatPort;

    @Override
    public Message sendMessage(String message) {
        return commandChatPort.createMessage(message);
    }
}

package jpabasic.portandadapterpractice.chat.adapter.out.persistance;

import jpabasic.portandadapterpractice.chat.adapter.out.persistance.entity.MessageEntity;
import jpabasic.portandadapterpractice.chat.application.port.out.CommandChatPort;
import jpabasic.portandadapterpractice.chat.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandChatAdapter implements CommandChatPort {
    private final MessageRepository messageRepository;

    @Override
    public Message createMessage(Message message) {
        return messageRepository.save(MessageEntity.from(message)).toModel();
    }
}

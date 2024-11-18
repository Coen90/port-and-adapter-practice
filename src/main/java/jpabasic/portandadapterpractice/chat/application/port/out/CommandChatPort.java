package jpabasic.portandadapterpractice.chat.application.port.out;

import jpabasic.portandadapterpractice.chat.domain.Message;

public interface CommandChatPort {
    Message createMessage(String message);
}

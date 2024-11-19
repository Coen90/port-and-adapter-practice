package jpabasic.portandadapterpractice.chat.application.port.in;

import jpabasic.portandadapterpractice.chat.domain.Message;

public interface CommandChatUseCase {
    Message sendMessage(Long roomId, String message);
}

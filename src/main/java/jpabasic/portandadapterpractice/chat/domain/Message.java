package jpabasic.portandadapterpractice.chat.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Message {
    private final Long id;
    private final String content;
    private final Long roomId;

    @Builder(access = AccessLevel.PACKAGE)
    private Message(Long id, String content, Long roomId) {
        this.id = id;
        this.content = content;
        this.roomId = roomId;
    }

    public static Message of(Long id, String content, Long roomId) {
        return Message.builder()
                .id(id)
                .content(content)
                .roomId(roomId)
                .build();
    }
}

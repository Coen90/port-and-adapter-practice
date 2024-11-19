package jpabasic.portandadapterpractice.chat.adapter.out.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jpabasic.portandadapterpractice.chat.domain.Message;
import lombok.AccessLevel;
import lombok.Builder;

@Entity
@Table(name = "message")
public class MessageEntity {
    @Id
    private Long id;
    private String content;
    private Long roomId;

    protected MessageEntity() {
    }

    @Builder(access = AccessLevel.PACKAGE)
    private MessageEntity(Long id, String content, Long roomId) {
        this.id = id;
        this.content = content;
        this.roomId = roomId;
    }

    public static MessageEntity from(Message message) {
        return MessageEntity.builder()
                .id(message.getId())
                .content(message.getContent())
                .roomId(message.getRoomId())
                .build();
    }
}

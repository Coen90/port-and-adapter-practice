package jpabasic.portandadapterpractice.chat.adapter.out;

import jpabasic.portandadapterpractice.chat.adapter.out.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
}

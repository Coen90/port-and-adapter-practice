package jpabasic.portandadapterpractice.chat.adapter.out.persistance;

import jpabasic.portandadapterpractice.chat.adapter.out.persistance.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
}

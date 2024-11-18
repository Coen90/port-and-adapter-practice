package jpabasic.portandadapterpractice.chat.adapter.in.web;

import jpabasic.portandadapterpractice.chat.application.port.in.CommandChatUseCase;
import jpabasic.portandadapterpractice.chat.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChatController {
    private final CommandChatUseCase commandChatUseCase;

    @PostMapping("/{roomId}")
    public ResponseEntity<Message> sendMessage(@PathVariable Long roomId, String content) {
        return ResponseEntity.ok()
                .body(commandChatUseCase.sendMessage(roomId, content));
    }
}

package jpabasic.portandadapterpractice.chat.adapter.in;

import jpabasic.portandadapterpractice.chat.application.port.in.CommandChatUseCase;
import jpabasic.portandadapterpractice.chat.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChatController {
    private final CommandChatUseCase commandChatUseCase;

    @PostMapping
    public ResponseEntity<Message> sendMessage(String message) {
        return ResponseEntity.ok()
                .body(commandChatUseCase.sendMessage(message));
    }
}

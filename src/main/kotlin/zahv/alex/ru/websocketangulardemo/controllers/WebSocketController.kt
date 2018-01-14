package zahv.alex.ru.websocketangulardemo.controllers

import lombok.extern.slf4j.Slf4j
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller
import zahv.alex.ru.websocketangulardemo.model.Message

@Controller
@Slf4j
class WebSocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    @Throws(InterruptedException::class)
    fun sendMessage(message: Message): Message {
        return message
    }
}
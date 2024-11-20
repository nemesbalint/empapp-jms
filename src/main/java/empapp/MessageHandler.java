package empapp;

import empapp.dto.EmployeeHasBeenCreatedMessage;
import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageHandler {

    @SneakyThrows
    @JmsListener(destination = "employeesQueue")
//    public void receiveMessage(Message message) {
//        if (message instanceof TextMessage textMessage) {
//            log.info("Message received: {}", textMessage.getText());
//        } else {
//            log.error("Unknown message received: {}", message);
//        }
//    }
    public void receiveMessage(EmployeeHasBeenCreatedMessage message) {
        log.info("Received employee has been created %d %s".formatted(message.id(), message.name()));
    }
}

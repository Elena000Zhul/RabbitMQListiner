package io;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {
    @RabbitListener(queues = "message_queue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}

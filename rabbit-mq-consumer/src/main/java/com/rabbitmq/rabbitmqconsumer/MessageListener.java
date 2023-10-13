package com.rabbitmq.rabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MqConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }
}

package com.websocket.websocket.config;

import com.websocket.websocket.model.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

//To push messages to the topic every now and then
@Configuration
@EnableScheduling
public class SchedularConfig {

    //use messaging protocol to push messages to topic
    @Autowired
    SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 5000)
    public void sendMessages(){
        template.convertAndSend("/topic/employee", new EmployeeResponse("Message from Scheduler"));
    }
}

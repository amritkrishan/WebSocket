package com.websocket.websocket.resource;

import com.websocket.websocket.model.Employee;
import com.websocket.websocket.model.EmployeeResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeResource {

    //rest end-point to call this method
    @MessageMapping("/employee")
    //push to broker
    @SendTo("/topic/employee")
    public EmployeeResponse getEmployee(Employee employee){
        return new EmployeeResponse("Hi "+employee.getName());
    }
}

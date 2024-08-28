package com.bridgelabz.jms1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MSGCtrl
{
    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping("/send")
    public String sendMsg(@RequestParam String msg)
    {
        jmsTemplate.convertAndSend("test.queue", msg);
        return "message sent "+msg;
    }
}

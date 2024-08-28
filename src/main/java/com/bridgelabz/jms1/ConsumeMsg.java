package com.bridgelabz.jms1;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeMsg
{
    @JmsListener(destination = "test.queue")
    public void RecieveMsg(String msg)
    {
        System.out.println("received message ->"+msg);
    }
}

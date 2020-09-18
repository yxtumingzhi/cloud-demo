package com.example.demoa.mq.controller;

import com.example.demoa.mq.ISendService;
import com.example.demoa.mq.request.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tumingzhi
 * @Date 2020/9/18 14:40
 **/

@RestController
public class StreamController {

    @Autowired
    private ISendService sendService;

    @PostMapping("/sendTest")
    public void sendTest(@RequestBody Request request){

        String msg = "hello stream ...";
        // 将需要发送的消息封装为Message对象
        sendService.send().send(MessageBuilder.withPayload(msg.getBytes()).build());

    }

}

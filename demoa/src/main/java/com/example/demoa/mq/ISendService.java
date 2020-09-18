package com.example.demoa.mq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 发送消息的接口
 */
public interface ISendService {

    /**
     * 指定输出的交换器名称
     */
    @Output("dpb-exchange")
    SubscribableChannel send();
}


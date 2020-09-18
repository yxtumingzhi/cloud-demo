package com.example.demoa.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 接收消息的接口
 */
public interface IReceiverService {

    /**
     * 指定接收的交换器名称
     */
    @Input("dpb-exchange")
    SubscribableChannel receiver();
}
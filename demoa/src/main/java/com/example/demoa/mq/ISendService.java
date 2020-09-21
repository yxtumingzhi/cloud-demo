package com.example.demoa.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 发送消息的接口
 */
public interface ISendService {

    String DPB_EXCHANGE_OUTPUT = "dpb-exchange-output";

    /**
     * 指定输出的交换器名称
     */
    @Output(ISendService.DPB_EXCHANGE_OUTPUT)
    SubscribableChannel send();
}


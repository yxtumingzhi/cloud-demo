package com.example.demoa.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * 接收消息的接口
 */
public interface IReceiverService {

    String DPB_EXCHANGE_INPUT = "dpb-exchange-input1";
    String DPB_EXCHANGE_INPUT_2 = "dpb-exchange-input2";

    /**
     * 指定接收的交换器名称
     */
    @Input(IReceiverService.DPB_EXCHANGE_INPUT)
    SubscribableChannel receiver();

    @Input(IReceiverService.DPB_EXCHANGE_INPUT_2)
    SubscribableChannel receiver2();
}
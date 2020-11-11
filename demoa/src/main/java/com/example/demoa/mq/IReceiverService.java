package com.example.demoa.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 接收消息的接口
 */
public interface IReceiverService {

    String DPB_EXCHANGE_INPUT = "dpb-exchange-input1";
    String DPB_EXCHANGE_INPUT_2 = "dpb-exchange-input2";

    String DPB_EXCHANGE_OUTPUT = "dpb-exchange-output";

    /**
     * 指定输出的交换器名称
     */
    @Output(IReceiverService.DPB_EXCHANGE_OUTPUT)
    MessageChannel send();

    /**
     * 指定接收的交换器名称
     */
    @Input(IReceiverService.DPB_EXCHANGE_INPUT)
    SubscribableChannel receiver();

    @Input(IReceiverService.DPB_EXCHANGE_INPUT_2)
    SubscribableChannel receiver2();
}
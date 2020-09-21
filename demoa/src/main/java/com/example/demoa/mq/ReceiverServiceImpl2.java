package com.example.demoa.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @Author tumingzhi
 * @Date 2020/9/18 16:05
 **/
@Service
@Slf4j
@EnableBinding(IReceiverService.class)
public class ReceiverServiceImpl2 {

    @StreamListener(IReceiverService.DPB_EXCHANGE_INPUT_2)
    public void receiverAction(String msg){
        log.info("2号接收到了一条消息：" + msg);
    }

}
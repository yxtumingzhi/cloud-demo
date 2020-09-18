package com.example.demoa.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @Author tumingzhi
 * @Date 2020/9/18 14:37
 **/
@Service
@Slf4j
@EnableBinding(IReceiverService.class)
public class ReceiverServiceImpl {

    @StreamListener("dpb-exchange")
    public void receiverAction(byte[] msg){
      log.info("接收到了一条消息：" + new String(msg));
    }

}

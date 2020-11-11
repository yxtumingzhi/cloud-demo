package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author tumingzhi
 * @Date 2020/9/28 17:05
 **/
@Component
public class fff {

    @Scheduled(fixedDelay = 1000)
    public void ddd(){
        System.out.println("____112----");
    }


}

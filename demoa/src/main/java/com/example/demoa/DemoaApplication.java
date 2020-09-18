package com.example.demoa;

import com.example.demoa.mq.IReceiverService;
import com.example.demoa.mq.ISendService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication

//@EnableEurekaServer
@EnableBinding({ISendService.class, IReceiverService.class})
public class DemoaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoaApplication.class, args);
    }

}

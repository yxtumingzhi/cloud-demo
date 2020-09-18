package com.example.demo.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tumingzhi
 * @Date 2020/9/11 16:01
 **/
@Slf4j
@RestController
public class DeamoController {


    @PostMapping("/testB")
    public String testB() {
        try {

            String url = "http://ad.partner.gifshow.com/track/activate"
                    + "?callback=" + "callback"
                    + "&event_type=" + "event_type"
                    + "&event_time=" + "event_time"
                    + "&purchase_amount=" + "purchase_amount";
            HttpResponse a = HttpRequest.get(url).execute();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "testB:result";
    }

}

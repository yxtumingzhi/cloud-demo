package com.example.demo.controller;

import cn.hutool.core.io.file.FileWriter;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.time.LocalTime;

/**
 * @Author tumingzhi
 * @Date 2020/9/11 16:01
 **/
@Slf4j
@RestController
public class DeamoController {



    @PostMapping("/test")
    public String test()  {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("testwerwe");
            writer.write("testwerwe");
            writer.write("testwerwe\n");
            writer.write("testwerwe");

            System.out.println(LocalTime.of(1000/3600, 1000/60,1000%60));


        return "rytur";
    }

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

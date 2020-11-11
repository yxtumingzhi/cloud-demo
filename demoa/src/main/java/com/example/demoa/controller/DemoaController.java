package com.example.demoa.controller;

import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.io.file.FileReader;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author tumingzhi
 * @Date 2020/9/11 15:59
 **/
@RestController
public class DemoaController {


    @PostMapping("/test")
    public String test()  {
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("testwerwe");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "test:result";
    }


    public void dee(int a, String b, Boolean c){
        a= 10;
        b += "qwre";
        c = false;
    }
}

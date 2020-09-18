package com.example.demoa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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

        //int a = 5/0;
        int a= 1;String b = "aaa";Boolean ddd = true;
        dee(a,b,ddd);
        System.out.println(a);
        System.out.println(b);
        System.out.println(ddd);
        List<Object> list = new ArrayList<>();
        list.add("true");
        list.add("asdf");
        boolean ddssd = (boolean) list.get(0);
        System.out.println(list);
        System.out.println(list.size());
        return "test:result";
    }


    public void dee(int a, String b, Boolean c){
        a= 10;
        b += "qwre";
        c = false;
    }
}

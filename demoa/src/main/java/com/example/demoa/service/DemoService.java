package com.example.demoa.service;

import org.springframework.stereotype.Service;

/**
 * @Author tumingzhi
 * @Date 2020/9/11 16:07
 **/
@Service
public class DemoService implements IDemoService{

    private String test(){
        return "tet";
    }

}

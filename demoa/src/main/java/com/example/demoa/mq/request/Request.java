package com.example.demoa.mq.request;

import lombok.Data;

/**
 * @Author tumingzhi
 * @Date 2020/9/18 14:41
 **/
@Data
public class Request {

    private String msg;

    private String body;

    private String code;

    private String nonce;

}

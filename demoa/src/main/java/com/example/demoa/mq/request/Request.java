package com.example.demoa.mq.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @Author tumingzhi
 * @Date 2020/9/18 14:41
 **/
@Data
public class Request implements Serializable {

    private static final long serialVersionUID = 2106070071658502248L;

    @NotNull(message = "asdfasdfas")
    private String msg;

    private String body;

    private String code;

    private String nonce;

   // private LocalDate date;

   // @JsonFormat(pattern = "yyyy-MM-dd")
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
   // //private LocalDate dateEnd;

}

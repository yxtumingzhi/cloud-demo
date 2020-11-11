package com.example.demoa.service;

import lombok.Data;

import java.util.Objects;

/**
 * @Author tumingzhi
 * @Date 2020/9/28 20:39
 **/
@Data
public class BaijiayunBaseResponse<T> {

	private Integer code = 1;
	private T data;
	private String msg = "msg";

	public boolean isSuccess(){
		return Objects.equals(1, this.code);
	}

}

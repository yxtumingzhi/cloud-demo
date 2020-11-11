package com.example.demoa.service;

import lombok.Data;

/**
 * @Author tumingzhi
 * @Date 2020/10/13 14:28
 **/
@Data
public class demos extends BaijiayunBaseResponse{
    /**
     * 教室ID,14位的数字
     */
    private String roomId = "dasf";

    /**
     * 管理员（助教）进入教室的参加码
     */
    private String adminCode = "dasf";

    /**
     * 老师进入教室的参加码
     */
    private String teacherCode = "dasf";

    /**
     * 学生公共参加码，该参加码可以进多个学生，不互踢
     */
    private String studentCode = "dasf";
}

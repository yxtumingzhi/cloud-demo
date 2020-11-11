package com.example.demo;

import cn.hutool.core.io.file.FileAppender;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.digest.DigestUtil;
import com.google.common.collect.Lists;
import org.springframework.http.MediaType;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author tumingzhi
 * @Date 2020/9/23 9:55
 **/
@RestController
public class sd {


    @PostMapping("/test")
    public String test()  {
        FileWriter writer = new FileWriter("test.txt");
        writer.write("345345345");
        writer.write("testwerwe");
        writer.write("testwerwe\n");
        writer.write("34sdfsdf");

        writer.append("1");
        writer.writeLines(Lists.newArrayList("3425345234qwer","asfd","aszvzcv"));

        FileReader reader = new FileReader("test.txt");
        System.out.println(reader.readString());
        return "rytur";
    }


    @PostMapping("/test2")
    public String test2()  {
        FileWriter writer = new FileWriter("test.txt");
        writer.write("testwerwe");
        writer.write("testwerwe");
        writer.write("testwerwe\n");
        writer.write("testwerwe");

        System.out.println(LocalTime.of(54/3600, 54/60,54%60));
        Integer a = null;
        //System.out.println(a > 0);

String testStr = "5393554e94bf0eb6436f240a4fd71282";
        String md5Hex1 = DigestUtil.md5Hex(testStr);
        System.out.println(md5Hex1);
        System.out.println(IdUtil.simpleUUID());
        System.out.println(IdUtil.simpleUUID());
        System.out.println(IdUtil.simpleUUID());
        System.out.println(IdUtil.simpleUUID());
        System.out.println(IdUtil.simpleUUID());
        System.out.println(IdUtil.simpleUUID());
        System.out.println(RandomUtil.randomString(32));


        Integer asss = 10;
        int df = 10;
        System.out.println(asss == df);
        System.out.println(asss != df);

        for (int i = 0;i<10;i++){
            //if(i==5)return "";
            System.out.println(i);
        }
        System.out.println("-------------=-=-=-=-=");
        System.out.println("-------------=-=-=-=-=");
        System.out.println("-------------=-=-=-=-=");


        System.out.println(DigestUtils.md5DigestAsHex("hello".getBytes()));

        Map<String, Object> params = new HashMap<>();
        params.put("title", "largeLesson.getLessonName()");
        params.put("start_time", "largeLesson.getLessonName()");
        params.put("end_time", "qwrwe");
        params.clear();
        System.out.println(params);



        return "rytur";
    }


    @GetMapping(value = "/getWxOpenIdsTxt", produces = MediaType.TEXT_PLAIN_VALUE)
    public byte[] getWxOpenIdsTxt() throws IOException {
        FileWriter fileWriter = new FileWriter("openid.txt");
        fileWriter.writeLines(Lists.newArrayList("o5bV16J9s0BMWCOUt8Zq0N_NiqC8", "o5bV16E5VCyu_xl6-OgsouQ5Dg3U"));
        return new FileReader("openid.txt").readBytes();
    }

}

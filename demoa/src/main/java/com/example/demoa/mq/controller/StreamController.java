package com.example.demoa.mq.controller;

import cn.hutool.json.JSONUtil;
import com.example.demoa.mq.IReceiverService;
import com.example.demoa.mq.ISendService;
import com.example.demoa.mq.request.Request;
import com.example.demoa.service.DemoService;
import com.example.demoa.service.IDemoService;
import com.example.demoa.service.demos;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author tumingzhi
 * @Date 2020/9/18 14:40
 **/

@RestController
public class StreamController {

    @Autowired
    private IReceiverService sendService;
    @Autowired
    private IDemoService iDemoService;
    @Autowired
    private DemoService demoService;

    @PostMapping("/sendTest")
    public void sendTest(@Valid @RequestBody Request request){
        demos demos1 = new demos();
        System.out.println(demos1.toString());
        System.out.println(demos1.getCode());
        System.out.println(JSONUtil.toJsonStr(demos1));
        String msg = "hello stream ...";
        // 将需要发送的消息封装为Message对象
        sendService.send().send(MessageBuilder.withPayload(msg.getBytes()).build());



    }








    @PostMapping("/sendTest1")
    public String sendTest1(@RequestBody Map map, @RequestHeader String userId){
        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("key1", "qwerq");
        multimap.put("key1", "asdfasdfas");
        multimap.put("keyw", "2131231");
        System.out.println(JSONUtil.toJsonStr(multimap));
        List<String> result = Stream.of(Lists.newArrayList("1", "1", "3"), Lists.newArrayList("1", "2"))
                .flatMap(Collection::stream).distinct().collect(Collectors.toList());
        System.out.println(result);

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("1111");
        list1.add("2222");
        list1.add("3333");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("3333");
        list2.add("4444");
        list2.add("5555");

        // 交集
        List<String> intersection = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("---得到交集 intersection---");
        intersection.parallelStream().forEach(System.out :: println);

        // 差集 (list1 比 list2 多的)
        List<String> reduce1 = list1.stream().filter(item -> !list2.contains(item)).collect(Collectors.toList());
        System.out.println("---得到差集 reduce1 (list1 - list2)---");
        reduce1.parallelStream().forEach(System.out :: println);

        // 差集 (list2 比 list1 多的)
        List<String> reduce2 = list2.stream().filter(item -> !list1.contains(item)).collect(Collectors.toList());
        System.out.println("---得到差集 reduce2 (list2 - list1)---");
        reduce2.parallelStream().forEach(System.out :: println);

        // 并集
        List<String> listAll = list1.parallelStream().collect(Collectors.toList());
        List<String> listAll2 = list2.parallelStream().collect(Collectors.toList());
        listAll.addAll(listAll2);
        System.out.println("---得到并集 listAll---");
        listAll.parallelStream().forEach(System.out :: println);

        // 去重并集
        List<String> listAllDistinct = listAll.stream().distinct().collect(Collectors.toList());
        System.out.println("---得到去重并集 listAllDistinct---");
        listAllDistinct.parallelStream().forEach(System.out :: println);

        System.out.println("---原来的List1---");
        list1.parallelStream().forEach(System.out :: println);
        System.out.println("---原来的List2---");
        list2.parallelStream().forEach(System.out :: println);

        // 一般有filter 操作时，不用并行流parallelStream ,如果用的话可能会导致线程安全问题



        return "";
    }












}

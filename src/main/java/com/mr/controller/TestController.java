package com.mr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanxiaowen on 2019/9/27.
 */
@RestController
public class TestController {

           @GetMapping("/test")
           public  String  testGet(){
               return "你好世界";
           }



           @PostMapping("/test1Post")
           public String test1Post(){
               System.out.println("湖人总冠军");
               return "我的世界";
           }





           //跳转页面需要加上controller注解
           /*@GetMapping("/testHtml")
           public String testThy(){
               return "/index.html";
           }*/



}

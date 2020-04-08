package com.mr.controller;

import com.mr.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by hanxiaowen on 2019/9/27.
 */

@RestController
public class TestParams {

     @PostMapping("/getParams")
     public Map<String,Object>  getParams(String name,Integer id){
        Map<String,Object>  retMap= new HashMap<>();
         retMap.put("name",name);
         retMap.put("id",id);
         return  retMap;

     }


     @PostMapping("/getParamsUser")
     public Map<String,Object>  getParamsUser(User user){
        Map<String,Object>  retMap= new HashMap<>();
         retMap.put("aname",user.getUserName());
         retMap.put("aid",user.getUserId());
         return  retMap;

     }


     @PostMapping("/getParamsUser1")
     public Map<String,Object>  getParamsUser1(@RequestBody User user){
        Map<String,Object>  retMap= new HashMap<>();
         retMap.put("aname",user.getUserName());
         retMap.put("aid",user.getUserId());
         return  retMap;

     }

}

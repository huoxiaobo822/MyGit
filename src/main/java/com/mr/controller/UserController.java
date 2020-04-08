package com.mr.controller;


import com.mr.pojo.User;
import com.mr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hanxiaowen on 2019/9/27.
 */
@RestController
public class UserController {
          @Autowired
          private IUserService userService;



          /*/**
           * @Description:addUserInfo
           * @Param:[user]
           * @return:java.util.Map<java.lang.String,java.lang.Object>
           * @Author: hdx
           * @Date: 2019/9/28
           */
          @PostMapping("/add")
          public Map<String,Object> addUserInfo(User user){

             int i=userService.addUserInfo(user);
             Map<String,Object> retMap=new HashMap<>();
             retMap.put("key",i+"");
              return  retMap;
          }



     /*/**
      * @Description:getUserAll
      * @Param:[]
      * @return:java.util.List<com.mr.pojo.User>
      * @Author: hdx
      * @Date: 2019/9/28
      */
    @GetMapping("/getUserAll")
    public List<User> getUserAll(){
        List<User> list = userService.getUserAll();
        return list;
    }

    /*/**
     * @Description:deleteUser
     * @Param:[user]
     * @return:void
     * @Author: hdx
     * @Date: 2019/9/28
     */
    @PostMapping("/deleteUser")
    public void deleteUser(User user){
        userService.deleteUser(user);
    }


    @PostMapping("/updateUser")
    public void updateUser(User user){
        userService.updateUser(user);
    }








}

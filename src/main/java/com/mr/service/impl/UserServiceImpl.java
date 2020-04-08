package com.mr.service.impl;

import com.mr.mapper.UserMapper;
import com.mr.pojo.User;
import com.mr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hanxiaowen on 2019/9/27.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
  private UserMapper userMapper;

    @Override
    public int addUserInfo(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public List<User> getUserAll() {
        return userMapper.getUserAll();
    }

    @Override
    public void deleteUser(User user) {
        userMapper.deleteUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}

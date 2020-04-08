package com.mr.service;

import com.mr.pojo.User;

import java.util.List;

/**
 * Created by hanxiaowen on 2019/9/27.
 */
public interface IUserService {
    int addUserInfo(User user);

    List<User> getUserAll();

    void deleteUser(User user);

    void updateUser(User user);
}

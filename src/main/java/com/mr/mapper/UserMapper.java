package com.mr.mapper;

import com.mr.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by hanxiaowen on 2019/9/27.
 */


public interface UserMapper {
    @Insert("insert into u_user(user_id,user_name) values(#{userId},#{userName})")
     public int insertUser(User user);
    @Select("select * from u_user")
    List<User> getUserAll();


    @Delete("delete  from u_user where user_name =#{userName}")
    void deleteUser(User user);
    @Update("update u_user set user_name = #{userName} where user_id = #{userId} ")
    void updateUser(User user);
}

package com.zoop.mapper;

import com.zoop.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017\8\1 0001.
 */
@Mapper
public interface UserMapper {

    //查询用户列表
    @Select("select * from user_11")
    List<User> findAll();

}

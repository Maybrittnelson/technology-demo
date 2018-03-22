package com.geshaofeng.springbootmybatisdemo.mapper;


import com.geshaofeng.springbootmybatisdemo.entity.User;

public interface UserMapper {

    /*selectOne mapper.xml.select.id*/
    User selectOneUser(String id);
}

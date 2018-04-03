package com.geshaofeng.springbootmybatisdemo.controller;

import com.geshaofeng.springbootmybatisdemo.entity.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        User user = sqlSessionTemplate.selectOne("com.geshaofeng.springbootmybatisdemo.mapper.UserMapper.selectOneUser", Integer.parseInt(id));
        return user;
    }

}

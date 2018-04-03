package com.geshaofeng.springbootmybatisdemo.demo;

import com.geshaofeng.springbootmybatisdemo.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.system.SystemProperties;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.EncodedResource;

import java.io.Reader;
import java.util.Properties;

public class MyBatisXmlConfigurationDemo
{
    public static void main(String[] args) throws Exception {

        System.out.print(SystemProperties.get("user.dir"));

        ResourceLoader resourceLoader = new DefaultResourceLoader();

        Resource resource = resourceLoader.getResource("classpath:/mybatis/mybatis-config.xml");

        EncodedResource encodedResource = new EncodedResource(resource, "utf-8");

        Reader reader = encodedResource.getReader();

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        //environment
        SqlSessionFactory sqlSessionFactory = builder.build(reader, "development", new Properties());

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("com.geshaofeng.springbootmybatisdemo.mapper.UserMapper.selectOneUser", 1);

        System.out.print(user);
        sqlSession.close();
    }
}

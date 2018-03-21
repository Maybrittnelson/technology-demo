package com.geshaofeng.springbootmybatisdemo.demo;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.EncodedResource;

import java.io.Reader;
import java.util.Properties;

public class MyBatisXmlConfigurationDemo
{
    public static void main(String[] args) throws Exception {
        ResourceLoader resourceLoader = new DefaultResourceLoader();

        Resource resource = resourceLoader.getResource("classpath:/mybatis/mybatis-config.xml");

        EncodedResource encodedResource = new EncodedResource(resource, "utf-8");

        Reader reader = encodedResource.getReader();

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        //environment
        SqlSessionFactory sqlSessionFactory = builder.build(reader, "development", new Properties());

        SqlSession sqlSession = sqlSessionFactory.openSession();

        sqlSession.selectOne("select * from user where id =#{id}", 1);

        sqlSession.close();
    }
}

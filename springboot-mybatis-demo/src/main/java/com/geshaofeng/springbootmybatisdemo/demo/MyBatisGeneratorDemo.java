package com.geshaofeng.springbootmybatisdemo.demo;

import com.geshaofeng.springbootmybatisdemo.entity.User;
import com.geshaofeng.springbootmybatisdemo.entity1.UserEntity;
import com.geshaofeng.springbootmybatisdemo.entity1.UserEntityExample;
import com.geshaofeng.springbootmybatisdemo.mapper1.UserEntityMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.system.SystemProperties;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.EncodedResource;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Properties;

public class MyBatisGeneratorDemo
{
    public static void main(String[] args) {

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();

        InputStream inputStream = contextClassLoader.getResourceAsStream("mybatis/mybatis-generator-config.xml");

        SqlSession sqlSession = null;
        try {
            InputStreamReader reader = new InputStreamReader(inputStream, "utf-8");

            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

            //environment
            SqlSessionFactory sqlSessionFactory = builder.build(reader, "development", new Properties());

            sqlSession = sqlSessionFactory.openSession();

            UserEntityMapper mapper = sqlSession.getMapper(UserEntityMapper.class);

            UserEntityExample userEntityExample = new UserEntityExample();

            UserEntityExample.Criteria criteria = userEntityExample.createCriteria();

            criteria.andIdEqualTo(1);

            List<UserEntity> user = mapper.selectByExample(userEntityExample);

            System.out.print(user);

        } catch (UnsupportedEncodingException e) {

        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }


    }
}

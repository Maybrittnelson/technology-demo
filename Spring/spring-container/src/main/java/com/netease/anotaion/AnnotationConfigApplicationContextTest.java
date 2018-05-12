package com.netease.anotaion;

import com.netease.meta.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 了解AnnotationConfigApplicationContext方式的IOC实现原理
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/10
 */
public class AnnotationConfigApplicationContextTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        User user = (User)ctx.getBean("user");
        System.out.println(user);
        ctx.close();
    }
}

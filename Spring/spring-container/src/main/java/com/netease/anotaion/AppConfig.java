package com.netease.anotaion;

import com.netease.meta.User;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * TODO
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @see
 * @since 2018/5/10
 */
@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy(true)
    public User user() {
        return new User();
    }
}

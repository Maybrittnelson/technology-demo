package com.geshaofeng.springbootmybatisdemo.properties;

import com.geshaofeng.springbootmybatisdemo.constant.ShaofengConstant;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "shaofeng.common")
public class CommonProperties {

    private String patternTime = ShaofengConstant.DEFAULT_TIME_PATTERN;


    public String getPatternTime() {
        return patternTime;
    }

    public void setPatternTime(String patternTime) {
        this.patternTime = patternTime;
    }
}

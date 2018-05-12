package com.netease.course;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;


public class ScrewDriver implements InitializingBean {

	private Header header;

	public void setHeader(Header header) {
		this.header = header;
	}
	
	public void use() {
		System.out.println("Use header: " + header.getInfo());
		header.doWork();
	}

	public void init() {
		System.out.println("init");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init1");
	}
}

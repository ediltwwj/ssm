package com.ssm.test;

import com.ssm.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 13967
 * @date 2019/8/17 17:11
 */
public class TestSpring {

    @Test
    public void run1(){

        // 加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService as = ac.getBean("accountService", AccountService.class);
        // 调用方法
        as.findAllAccount();
    }
}

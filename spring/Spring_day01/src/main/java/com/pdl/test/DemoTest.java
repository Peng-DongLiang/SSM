package com.pdl.test;

import com.pdl.dao.AccountDao;
import com.pdl.dao.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        AccountDao accountDao =(AccountDao) context.getBean("accountDao");
//        System.out.println(accountDao);
        for (int i = 0; i <5 ; i++) {
            AccountService accountService=(AccountService)context.getBean("accountService");
            System.out.println(accountService);
        }
    }
}

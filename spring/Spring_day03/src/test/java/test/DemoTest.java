package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pdl.domain.Account;
import pdl.service.AccountService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:bean.xml"})
public class DemoTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void findone(){
        Account query = accountService.query(1);
        System.out.println(query);
    }
    @Test
    public void findAll(){
        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
        AccountService o =(AccountService) context.getBean("accountService");
        Account all = o.query(1);
            System.out.println(all);

    }
}

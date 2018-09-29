package pdl.proxy;


import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;
import java.sql.Connection;


public class Transaction {

    public void before(){
        System.out.println("配置前置通知");
    }
    public void afterReturning(){
        System.out.println("配置后置通知");
    }

    public void afterthrowing(){
        System.out.println("配置异常通知");
    }

    public void after(){
        System.out.println("配置最终通知");
    }

}

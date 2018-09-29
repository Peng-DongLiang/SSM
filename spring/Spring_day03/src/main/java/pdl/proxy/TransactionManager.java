package pdl.proxy;


import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class TransactionManager {
@Pointcut("execution(* pdl.service.Imp.AccountServiceImp.query(Integer))")
    public void pointcutref(){

    }
    @Before("pointcutref()")
    public void before(){
      System.out.println("配置前置通知");
    }
    @AfterReturning("pointcutref()")
    public void afterReturning(){
        System.out.println("配置后置通知");
    }
    @AfterThrowing("pointcutref()")
    public void afterthrowing(){
        System.out.println("配置异常通知");
    }
    @After("pointcutref()")
    public void after(){
        System.out.println("配置最终通知");
    }
    public void around (){
        System.out.println("配置环绕通知");
    }
}

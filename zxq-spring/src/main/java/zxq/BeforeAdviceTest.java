package zxq;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAdviceTest {
    // 匹配 com.wicresoft.app.service.impl 包下所有类的所有方法作为切入点
    @Before("execution(* txh.*.*(..))")
    public void authorith(){
//        +Thread.currentThread().getStackTrace()
        System.out.println("模拟进行权限检查。");
    }
}

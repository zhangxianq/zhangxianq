package zxq;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningAdviceTest {
    // 匹配 com.wicresoft.app.service.impl 包下所有类的所有方法作为切入点
    @AfterReturning(returning="rvt", pointcut="execution(* txh.*.*(..))")
    public void log(Object rvt) {
        System.out.println("模拟目标方法返回值：" + rvt);
        System.out.println("模拟记录日志功能...");
    }
}

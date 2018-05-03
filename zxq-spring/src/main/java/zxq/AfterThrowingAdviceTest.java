package zxq;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowingAdviceTest {
    @AfterThrowing(throwing="ex", pointcut="execution(* txh.*.*(..))")
    public void doRecoverActions(Throwable ex) {
        System.out.println("目标方法中抛出的异常：" + ex);
        System.out.println("模拟抛出异常后的增强处理...");
    }
}

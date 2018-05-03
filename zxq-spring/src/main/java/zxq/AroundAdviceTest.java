package zxq;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;

public class AroundAdviceTest {
    // 匹配 com.wicresoft.app.service.impl 包下所有类的所有方法作为切入点
    @Around("execution(* txh.*.*(..))")
    public Object processTx(ProceedingJoinPoint jp) throws java.lang.Throwable {
        System.out.println("执行目标方法之前，模拟开始事物...");
        // 执行目标方法，并保存目标方法执行后的返回值
        Object[] args = jp.getArgs();
        Signature signature = jp.getSignature();
        Object target = jp.getTarget();
        Object aThis = jp.getThis();
        Object rvt = jp.proceed(new String[]{"被改变的参数"});
        System.out.println("执行目标方法之前，模拟结束事物...");
        return rvt + "新增的内容";
    }
}

package zxd;

import jdk.nashorn.internal.parser.JSONParser;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;

@Component
@Aspect
public class Qiemian {

    @Before("execution(* zxd.*.shuijiao(..))")
    public void chifanqian(){
        System.out.println("洗手");
    }

    @After("execution(* zxd.*.shuijiao(..))")
    public void chifanhou(JoinPoint joinPoint) throws Exception {
        System.out.println(getControllerMethodDescription(joinPoint));
        System.out.println("漱口");
    }

    @Before("execution(* zxd.*.shuijiao(..))")
    public void shuijiaoqian(){
        System.out.println("洗澡");
    }

    // 通过反射获取参入的参数
    public static String getControllerMethodDescription(JoinPoint joinPoint) throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class targetClass = Class.forName(targetName);
        String description = "";

        Method[] methods = targetClass.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();

                if (clazzs.length == arguments.length) {
                    System.out.println("类："+targetName+"    方法："+methodName+"    参数："+ StringUtils.arrayToDelimitedString(arguments,"|"));
                    break;
                }
            }
        }
        return description;
    }

}

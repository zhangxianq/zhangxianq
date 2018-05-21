package zxd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //要用接口接收
        IHuman c= (IHuman)context.getBean("chinese");
        c.chifan("1");
        c.shuijiao("2");
        System.out.println("*********************************");
        //要用接口接收
        IHuman a= (IHuman) context.getBean("american");
        a.chifan("3");
        a.shuijiao("4");
    }
}

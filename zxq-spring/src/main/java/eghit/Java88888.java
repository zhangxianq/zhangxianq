package eghit;

import java.time.LocalDate;

public class Java88888 {


    public static void main(String[] args) {
        LocalDate.now();


//        jjs

        //lambda 表达式  不能是final参数
        Runnable runnable = () -> System.out.println(LocalDate.now().toString());
        runnable.run();
        //Stream  Java 8 中的Stream是对集合（Collection）对象功能的增强


    }
}

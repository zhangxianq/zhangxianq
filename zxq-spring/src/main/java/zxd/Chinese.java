package zxd;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements IHuman {
    public void chifan(String aaa) {
        System.out.println("chinese chifan "+aaa);
    }

    public void shuijiao(String aaa) {
        System.out.println("chinese shuijiao "+aaa);
    }
}

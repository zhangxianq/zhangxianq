package zxd;

import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Component
public class American implements IHuman {
    public void chifan(String aaa) {
        System.out.println("American chifan "+aaa);
    }

    public void shuijiao(String aaa) {
        System.out.println("American shuijiao "+aaa);
    }
}

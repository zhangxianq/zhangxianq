package zxq.observer;

public class WTest {
    public static void main(String[] args) {
        //来了一个小丑
        Clown clown = new Clown("小丑A");
        //观众入场了
        for (int i = 0; i < 20; i++) {
            Viewer v = new Viewer(i);
            clown.addObserver(v);
            System.out.println("座号为"+v.getSeatNo()+"的观众入座");
        }
        //小丑开始表演
        clown.perform();
        //小丑表演完毕，退场
        clown.exit();


        Clown clown2 = new Clown("小丑B");
        //观众入场了
        for (int i = 0; i < 20; i++) {
            Viewer v = new Viewer(i);
            clown2.addObserver(v);
            System.out.println("座号为"+v.getSeatNo()+"的观众入座");
        }
        //小丑开始表演
        clown2.perform();
        //小丑表演完毕，退场
        clown2.exit();
    }
}

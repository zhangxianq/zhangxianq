package zxq.util.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatcher {

        public static void main(String[] args) throws InterruptedException{

            CountDownLatch countDownLatch = new CountDownLatch(1){
                @Override
                public void await() throws InterruptedException {
                    super.await();
                    System.out.println(Thread.currentThread().getName() +  " count down is ok");
                }
            };

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    //do something

                    System.out.println(Thread.currentThread().getName() + " is done");
                    countDownLatch.countDown();
                    while (true){
                        try {
                            Thread.sleep(1000);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("11111-");
                    }
                }
            }, "thread1");

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    //do something

                    System.out.println(Thread.currentThread().getName() + " is done");
                    countDownLatch.countDown();
                    while (true){
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("22222-");
                    }
                }
            }, "thread2");


            thread1.start();
            thread2.start();
            System.out.println("一起开始了。。。");
            countDownLatch.await();
        }



}

package zxq.interceptor;

public class BusinessService implements IBusinessInterface {
    public void doSomething() {
        System.out.println("在业务组件 BusinessService 中调用方法: doSomething()");
    }
}
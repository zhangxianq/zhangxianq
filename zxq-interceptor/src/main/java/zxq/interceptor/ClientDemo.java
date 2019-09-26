package zxq.interceptor;

public class ClientDemo {

    public static void main(String args[]) {
        // 创建动态代理处理工具
        DynamicProxyHandler handler = new DynamicProxyHandler();

        // 创建业务组件对象
        IBusinessInterface business = new BusinessService();


        // 创建业务组件对象，并用动态代理绑定代理类
        IBusinessInterface businessProxy = (IBusinessInterface) handler.bind(business);

        businessProxy.doSomething();

        business.doSomething();
    }

}

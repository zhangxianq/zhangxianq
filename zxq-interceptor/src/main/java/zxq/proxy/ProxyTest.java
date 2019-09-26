package zxq.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class ProxyTest {

    public static void main(String[] args) {
        System.out.println(new Date().getTime());
//        Sourceable source = new Source();
//        Sourceable test = (Sourceable) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Sourceable.class}, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("test");
//                if ("method".equals(method.getName())) {
//                    return method.invoke(source, null);
//                }
//                return null;
//            }
//        });
//        test.method();
    }
}

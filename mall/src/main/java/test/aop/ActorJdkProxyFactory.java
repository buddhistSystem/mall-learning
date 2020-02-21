package test.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Administrator
 * @Date: 2019/11/6 0006 08:16
 * @Description: jdk代理
 */
public class ActorJdkProxyFactory {

    private Object object;

    public ActorJdkProxyFactory(Object object) {
        this.object = object;
    }

    public Object getProxyInstance() {
        Object proxy = Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("面谈合作");
                System.out.println("签订合同");
                //执行目标对象的方法
                Object returnValue = method.invoke(object, args);
                System.out.println("收钱");
                return returnValue;
            }
        });
        return proxy;
    }
}

package test.aop;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Administrator
 * @Date: 2019/11/6 0006 09:42
 * @Description:
 */
public class ActorTwoCglibProxyFactory implements MethodInterceptor {

    private Object object;

    public ActorTwoCglibProxyFactory(Object object) {
        this.object = object;
    }

    public Object getProxyInstance() {
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(object.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("面谈合作");
        System.out.println("签订合同");
        Object returnValue = method.invoke(object, args);
        System.out.println("收钱");
        return returnValue;
    }

}

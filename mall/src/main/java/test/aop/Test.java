package test.aop;

/**
 * @Author: Administrator
 * @Date: 2019/11/6 0006 08:05
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        //静态代理
        // 缺点：代理对象需要与目标对象实现一样的接口，一旦接口改变，两房都要维护

        //1.创建实例对象
        //2.创建代理对象，并且将实例对象传入代理对象，类似包装
        //3.代理对象执行方法
        ActorImpl actor = new ActorImpl();
        ActorProxy actorProxy = new ActorProxy(actor);
        actorProxy.film();


        //jdk动态代理
        //被代理的对象必须实现接口
//        ActorImpl actor = new ActorImpl();
//        Actor proxy = (Actor) new ActorJdkProxyFactory(actor).getProxyInstance();
//        proxy.film();

        //cglib动态代理
        AcotrTwo acotrTwo = new AcotrTwo();
        AcotrTwo proxy = (AcotrTwo) new ActorTwoCglibProxyFactory(acotrTwo).getProxyInstance();
        proxy.film();
        proxy.stop();
    }

}

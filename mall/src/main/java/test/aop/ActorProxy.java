package test.aop;

/**
 * @Author: Administrator
 * @Date: 2019/11/6 0006 08:02
 * @Description: 演员代理类
 */
public class ActorProxy implements Actor{

    private ActorImpl actor;

    public ActorProxy(ActorImpl actor) {
        this.actor = actor;
    }

    @Override
    public void film() {
        System.out.println("面谈合作");
        System.out.println("签订合同");
        actor.film();
        System.out.println("收钱");
    }

}

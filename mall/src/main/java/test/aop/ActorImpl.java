package test.aop;

/**
 * @Author: Administrator
 * @Date: 2019/11/5 0005 15:25
 * @Description: 演员的实现类
 */
public class ActorImpl implements Actor {
    @Override
    public void film() {
        System.out.println("开始拍片");
    }

}

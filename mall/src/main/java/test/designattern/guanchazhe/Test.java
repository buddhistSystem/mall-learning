package test.designattern.guanchazhe;

import java.util.ArrayList;
import java.util.List;

public class  Test{
    
    public static void main(String[] args) {
        LaoWang laoWang = new LaoWang();
        LaoLi laoLi = new LaoLi();
        XiaoMei xiaoMei = new XiaoMei();
        //老王老李在小美那儿注册
        xiaoMei.addPerson(laoWang);
        xiaoMei.addPerson(laoLi);
        //小美发送消息
        xiaoMei.notifyPerson();
    }
}


/**
 * 观察者老王
 * @author liqian
 */
class LaoWang implements Person{

    private String name = "老王";

    @Override
    public void getMsg(String msg) {
        System.out.println(name+"接收到了小美的消息，内容是："+msg);
    }
}

/**
 * 观察者老李
 * @author liqian
 */
class LaoLi implements Person{

    private String name = "老李";

    @Override
    public void getMsg(String msg) {
        System.out.println(name+"接收到了小美的消息，内容是："+msg);
    }
}

/**
 * 被观察者小美
 * @author liqian
 */
class XiaoMei {

    private List<Person> list = new ArrayList<>();

    public void addPerson(Person person){
        list.add(person);
    }

    /**
     * 遍历list，把自己的通知发送给所有暗恋自己的人
     */
    public void notifyPerson() {
        for(Person person:list){
            person.getMsg("你们过来吧，谁先过来谁就能陪我一起玩儿游戏!");
        }
    }
}

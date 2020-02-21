package test.reflex;

import java.lang.reflect.Method;

public class RobotTest {
    public static void main(String[] args) throws Exception {
        Class rc = Class.forName("test.reflex.Robot");
        //动态创建对象
        Robot robot = (Robot) rc.newInstance();
        Method sayHello = rc.getDeclaredMethod("sayHello",String.class);
        sayHello.setAccessible(true);
        sayHello.invoke(robot,"mali");
    }
}

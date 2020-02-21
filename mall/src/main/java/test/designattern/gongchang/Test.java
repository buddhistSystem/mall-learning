package test.designattern.gongchang;

/**
 * @author liqian
 */
public class Test {

    public static void main(String[] args) {
        Car car = CarFactory.getInstance("BenChi");
        if (car != null) {
            car.run();
            car.stop();
        } else {
            System.out.println("没有该类汽车");
        }

    }
}

class BenChi implements Car {

    @Override
    public void run() {
        System.out.println("奔驰开动");
    }

    @Override
    public void stop() {
        System.out.println("奔驰停车");
    }
}

class AaoDi implements Car {

    @Override
    public void run() {
        System.out.println("奥迪开动");
    }

    @Override
    public void stop() {
        System.out.println("奥迪停车");
    }
}

/**
 * 工厂类（简单工厂模式)
 */
class CarFactory {

    public static Car getInstance(String type) {
        Car car = null;
        if ("BenChi".equalsIgnoreCase(type)) {
            car = new BenChi();
        }
        if ("AaoDi".equalsIgnoreCase(type)) {
            car = new AaoDi();
        }
        return car;
    }
}



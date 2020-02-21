package test.designattern.zhuangshizhe;

/**
 * @author liqian
 */
public class Test {

    public static void main(String[] args) {
        Food food = new Bread(new Cream(new Food("香肠")));
        System.out.println(food.makeFood());
    }
}

/**
 * 面包类
 * @author liqian
 */
class Bread extends Food{

    private Food basicFood;

    public Bread(Food food){
        this.basicFood = food;
    }

    @Override
    public String makeFood(){
        return basicFood.makeFood()+"面包";
    }
}

/**
 * 奶油类
 * @author liqian
 */
class Cream extends Food{

    private Food basicFood;

    public Cream(Food food){
        this.basicFood = food;
    }

    @Override
    public String makeFood(){
        return basicFood.makeFood()+"奶油";
    }
}

package test.designattern.zhuangshizhe;

/**
 * 装饰者模式
 * java中io流就使用了这种模式
 * @author liqian
 */
public class Food {
    private String foodName;

    public Food(){

    }

    public Food(String foodName){
        this.foodName = foodName;
    }

    public String makeFood(){
        return foodName;
    }
}

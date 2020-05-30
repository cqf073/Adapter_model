package 对象适配器;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/3017:00
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Chicken_adapt implements Duck {
    private Chicken chicken;

    public Chicken_adapt(Chicken chicken) {
        this.chicken = chicken;
    }


    @Override
    public void fly() {
        chicken.jiji();
    }

    @Override
    public void quack() {
        chicken.fly();

    }
}

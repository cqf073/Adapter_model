package 类适配器;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/3017:00
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Chicken_adapt extends Chicken1 implements Duck {

    @Override
    public void quack() {
        super.jiji();

    }
    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();

    }
}

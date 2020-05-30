package 类适配器;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/3016:57
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Duck1 implements Duck {
    @Override
    public void fly() {
        System.out.println("l can fly long distant ya");
    }

    @Override
    public void quack() {
        System.out.println("ga~ga~ya");

    }
}

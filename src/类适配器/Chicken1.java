package 类适配器;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/3016:59
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Chicken1 implements Chicken {
    @Override
    public void fly() {
        System.out.println("l can not fly ji");
    }

    @Override
    public void jiji() {
        System.out.println("ji~ji~ji");
    }
}

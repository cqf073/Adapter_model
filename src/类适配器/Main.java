package 类适配器;

public class Main {

    public static void main(String[] args) {
        Chicken1 chicken =new Chicken1();
        Duck1 duck1 = new Duck1();
        Duck d = new Chicken_adapt();
        chicken.jiji();
        chicken.fly();

        duck1.quack();
        duck1.fly();

        d.quack();
        d.fly();
    }
}

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Quack());
        mallard.performQuack();
        mallard.performFly();
        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyNoWay());
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

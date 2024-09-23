/*
    데코레이터 객체
 */

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    public double cost() {
        //  장식하고 있는 객체에 가격을 구하는 작업을 위임해서 음료 자체의 값을 구하고
        //  거기에 두유 값을 더해 그 합을 리턴 함
        return 0.15 + beverage.cost();
    }
}

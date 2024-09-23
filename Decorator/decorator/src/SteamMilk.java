/*
    데코레이터 객체
 */

public class SteamMilk extends CondimentDecorator{
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀밀크";
    }

    public double cost() {
        //  장식하고 있는 객체에 가격을 구하는 작업을 위임해서 음료 자체의 값을 구하고
        //  거기에 스팀밀크 값을 더해 그 합을 리턴 함
        return 0.20 + beverage.cost();
    }
}

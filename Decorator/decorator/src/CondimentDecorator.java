/*
    추상 데코레이터
 */

public abstract class CondimentDecorator extends Beverage{

    //  모든 데코레이터에서 해당 메소드를 구현하도록 만들 계획 그래서 추상 메소드로 선언
    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}

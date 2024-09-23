/*
    구상 구성요소 (핵심객체로 가정)
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "다크로스트";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}

/*
    구상 구성요소 (핵심객체로 가정)
 */

public class Decaf extends Beverage{

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}

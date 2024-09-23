/*
    구상 구성요소 (핵심객체로 가정)
 */

public class Espresso extends Beverage{

    public Espresso() {
        //  Beverage에서 상속 받은 인스턴스 변수
        description = "에스프레소";
    }


    //  가격을 더하는것에 상관없이 에스프레소의 가격만 리턴하면 됨.
    @Override
    public double cost() {
        return 1.99;
    }
}

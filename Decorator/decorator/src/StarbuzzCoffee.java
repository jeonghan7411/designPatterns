public class StarbuzzCoffee {

    public static void main(String[] args) {
        //  팩토리와 빌더 디자인 패턴에서 아래와 같은 객체를 만드는 더 나은 방법에 대해서 배움
        //  데코레이터 패턴을 사용하면 관리해야 할 객체가 늘어남
        //  하지만 데코레이터 패턴은 팩토리나 빌더 같은 다른패턴을 써서 만들고 사용하게 됨

        // 데코레이터 패턴의 핵심은 클래스를 변경하지 않고 객체의 동작을 수정하거나 확장하기 위해 객체를 래핑 하는 것.
        //  장점
        //  유연성 - 데코레이터는 런타임에 동적으로 결합될 수 있어 상속보다 더 유연한 기능을 제공
        //  단일 책임 원칙(SRP)준수 : 각 데코레이터는 특정 기능의 추가 또는 수정에만 집중
        //  개방 폐쇄 원칙(OCP)준수 : 기존 코드를 변경하지 않고 새로운 데코레이터 클래스를 추가함으로써 기능을 쉽게 확장
        //  의존성 역전 원칙(DIP)준수 : 컴포넌트와 데코레이터가 모두 동일한 인터페이스나 추상 클래스를 공유하므로 데코레이터가 컴포넌트에 의존하지 않는다.

        //  단점
        //  복잡성 증가 : 객체를 여러 층으로 감싸기 때문에 클래스의 수가 많아지고 복장섭이 증가
        //  순서 의존성 : 데코레이터를 적용하는 순서에 따라 최종적으로 생성되는 객체의 동작이나 상태가 달라질 수 있다.

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
    }
}

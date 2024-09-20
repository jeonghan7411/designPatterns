package ex;/*
 슈퍼클래스의 행동을 모두 상속할 때 단점

    서브클래스에서의 코드 중복
    프로그램 실행 중 코드 수정 어려움
    모든 서브클래스의 행동을 알 수 없음
    코드 변경 시 다른 클래스에 의도치 않은 영향을 끼칠 수 있음


    디자인 원칙 증
    - 애플리케이션에서 달라지는 부분을 찾아 내고, 달라지지 않는 부분으로부터 분리 시킨다.
    - 구현이 아닌 인터페이스에 맞춰서 프로그래밍 한다.

 */


public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

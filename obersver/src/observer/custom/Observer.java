package observer.custom;


/*
    모든 기상 구성요소에서 Observer 인터페이스를 구현함.
    인터페이스의 역할을 주제 객체에서 옵저버한테 갱신된 정보를 전달할 수 있는 방법 제공.
    옵저버 객체의 인터페이스, 주제로부터 업데이트를 받는 메서드를 정의
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure); //  기상 정보가 변경되었을 때 옵저버한테 전달되는 상태 값
}

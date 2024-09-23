/*
    추상 구성요소
 */

//  추상 인터페이스를 할 경우 아래의 메서드를 모두 구현해야하지만
//  추상 클래스일 경우 description를 서브클래스로 전달 할 수 있다
public abstract class Beverage {
    String description = "제목없음";

    //   해당 클래스에서 이미 구현
    public String getDescription() {
        return description;
    }

    //  서브 클래스에서 구현 해야함
    public abstract double cost();
}

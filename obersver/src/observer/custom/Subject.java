package observer.custom;

/**
 * 주제 객체의 인터페이스  옵저버를 등록/제거하고 알림을 보내는 메서드를 정의함.
 */


public interface Subject {
    public void registerObserver(Observer o);   //  옵저버를 등록하는 역할
    public void removeObserver(Observer o);     //  옵저버를 제거하는 역할
    public void notifyObserver();               // 주제 객체의 상태가 변경되었을 떄 모든 옵저버들에게 알리기 위해 호출되는 메소드
}

package chapter8.template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public abstract void wiper();
    public void washCar() {}    //필요에 의해서 재정의.

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public final void run() {   //이 시나리오는 변할 수 없다. 하위클래스에서는 이 메소드를 오버라이드 할수없다. 이게 템플릿메서드
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();
    }
}

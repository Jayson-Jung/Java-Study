package chapter8.template;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 스스로 방향을 조정합니다.");
    }

    @Override
    public void wiper() {
        System.out.println("자동으로 와이퍼를 조작합니다.");
    }

    @Override
    public void washCar() {
        System.out.println("자동으로 세차합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 스스로 멈춥니다.");
    }
}

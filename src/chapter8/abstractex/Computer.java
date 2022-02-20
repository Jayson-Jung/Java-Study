package chapter8.abstractex;

public abstract class Computer {    //abstract method 가 있으면 abstract class가 되어야한다.

    public abstract void display(); //
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}


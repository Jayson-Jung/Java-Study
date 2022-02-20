package chapter10.interfaceex;

public interface Calc {// 인터페이스엔 상수와 추상메서드가 정의된다.
    double PI = 3.14;       // final 선언을 하지 않아도 상수로 선언된다.
    int ERROR = -999999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}

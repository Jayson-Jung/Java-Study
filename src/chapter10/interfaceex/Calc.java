package chapter10.interfaceex;

public interface Calc {// 인터페이스엔 상수와 추상메서드가 정의된다.
    double PI = 3.14;       // final 선언을 하지 않아도 상수로 선언된다.
    int ERROR = -999999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {    //공통적으로 사용되는 구현데이터가 있을경우 default 메서드로 정의한다.
        System.out.println("정수 계산기를 구현합니다.");
    }

    static  int total(int[] arr) {
        int total = 0;

        for(int i : arr) total += i;
        return total;
    }
}

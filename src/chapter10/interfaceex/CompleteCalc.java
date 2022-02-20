package chapter10.interfaceex;

public class CompleteCalc extends Calculator{
    // Calculator 중에 일부 -- 구현상속이라한다. (implements는 타입상속, extends는 구현상속이라한다.)
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 != 0) return num1 / num2;
        return ERROR;
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }
}

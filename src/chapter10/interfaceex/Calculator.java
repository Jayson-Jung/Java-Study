package chapter10.interfaceex;

public abstract class Calculator implements Calc{
    //인터페이스 타입을 상속했다 해서 타입상속이라 부른다.
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
}

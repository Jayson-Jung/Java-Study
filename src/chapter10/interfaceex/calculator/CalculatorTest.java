package chapter10.interfaceex.calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc(); //인터페이스를 기반으로 구현된 인스턴스클래스를 가져다 쓰는걸 클라이언트코드라고 부른다.(서비스를 가져다쓰는쪽)

        System.out.println(calc.add(num1, num2));

        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}

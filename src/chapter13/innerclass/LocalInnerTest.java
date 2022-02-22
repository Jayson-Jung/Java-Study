package chapter13.innerclass;

class Outer {

    int outNum = 100;
    static int sNum = 200;
    //익명 innerclass
    Runnable runnable = new Runnable() {

        @Override
        public void run() {
            System.out.println("runnable");
        }
    };

    public Runnable getRunnable(int i) {
        int localNum = 100;     // final 키워드가 있다고 보면된다.
        return new Runnable() {      //메서드 호출되자마자 클래스 생성 후 반환

            @Override
            public void run() {
                // localNum += 10; 오류발생(값을 변경시키기 때문 --> 메서드의 매개변수와 로컬변수는 stack에 자리잡고 메서드가 끝나면 소멸
                // i += 200

                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        };
    }
}

public class LocalInnerTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getRunnable(20).run();

        Runnable runnable = outer.getRunnable(20);
        runnable.run();

        outer.runnable.run();
    }
}

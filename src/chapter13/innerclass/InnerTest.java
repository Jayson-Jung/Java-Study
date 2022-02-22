package chapter13.innerclass;
class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    private class InClass {     /*인스턴스 내부클래스*/
        int inNum = 200;

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }
    }

    public void usingInTest() {
        inClass.inTest();
    }

    static class InStaticClass {    /*정적 내부클래스*/
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            //num += 10;      //static 클래스이므로 외부 인스턴스 사용불가
            sNum += 10;
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }
        static void sTest() {
            System.out.println(sNum);
            System.out.println(sInNum);
        }
    }
}

public class InnerTest {

    public static void main(String[] args) {

        OutClass outClass = new OutClass(); // 생성하면 inClass생성
        outClass.usingInTest();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        OutClass.InStaticClass.sTest();

        //outClass.inClass.inTest();

        //OutClass.InClass inClass = outClass.new InClass();
        //inClass.inTest();
    }
}

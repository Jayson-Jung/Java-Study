package chapter8.abstractex;

public class ComputerTest {

    public static void main(String[] args) {
        //omputer c1 = new Computer();
        Computer c2 = new Desktop(); // 상위클래스도 업캐스팅 가능
        //Computer c3 = new Laptop();
        Laptop c4 = new MyLaptop();

        c2.display();
        c4.display();
    }
}

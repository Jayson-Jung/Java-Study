package chapter7.inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        /*Customer customerLee = new Customer(100010, "Lee");
        customerLee.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10010, "Kim", 100);
        customerKim.calcPrice(10000);
        System.out.println(customerKim.showCustomerInfo());*/

        Customer customerWho = new VIPCustomer(10010, "Who", 100);
        int price = customerWho.calcPrice(10000); //customer의 calcPrice를 호출했는데 VIPCustomer의 calcPrice가 호출 --> 가상함수의 개념
        /*참조할 수 있는 거는 모든 Customer 타입 것만 참조하는데 실제 생성된 instance 가 호출된다.*/
        System.out.println("지불 금액은 " + price + "이고 " + customerWho.showCustomerInfo());
    }
}

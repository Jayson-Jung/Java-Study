package chapter7.inheritance;

public class CustomerTest {

    public static void main(String[] args) {
        /*Customer customerLee = new Customer();
        customerLee.customerID = 10100;
        customerLee.customerName = "Lee";*/

        VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 10102); // upcasting 묵시적형변환

        customerKim.bonusPoint = 1000;
        //System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());

        Customer customerGold = new GoldCustomer();
        customerGold.calcPrice(10000);
        customerGold.showCustomerInfo();
    }
}

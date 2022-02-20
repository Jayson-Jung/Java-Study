package chapter7.inheritance;

public class GoldCustomer extends Customer{

    public GoldCustomer() {
        bonusRatio = 0.05;
    }

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
    }

    @Override
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}

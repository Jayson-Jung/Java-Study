package chapter7.product;

import java.io.IOException;
import java.util.Scanner;

public class ProductInfo {
    public static void main(String[] args) throws IOException {
        Product product = new Product();
        Scanner input = new Scanner(System.in);
        int ch;
        do {
            System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3) : ");
            ch = input.nextInt();

            if (ch == 1) product.addProduct();
            else if (ch == 2) product.showAllInfo();
        } while(ch != 3);
    }
}

package chapter7.product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    int idNum;
    String description;
    String producer;
    String priceInfo;

    ArrayList<Product> productList = new ArrayList<>();

    public void addProduct() throws IOException {
        System.out.print("상품 종류 책(1), 음악CD(2), 회화책(3) : ");
        Scanner input = new Scanner(System.in);
        int productCode = input.nextInt();
        idNum = productCode;
        if(productCode == 1) {
            Book book = new Book(10010);
            book.idNum = idNum;
            System.out.print("Description : ");
            book.description = input.next();
            System.out.print("Producer : ");
            book.producer = input.next();
            System.out.print("Price : ");
            book.priceInfo = input.next();
            System.out.print("Author : ");
            book.author = input.next();
            System.out.print("Title : ");
            book.bookTitle = input.next();

            productList.add(book);
            this.showAllInfo();
        }
        else if(productCode == 2) {
            CompactDisc disk = new CompactDisc();
            disk.idNum = idNum;
            System.out.print("Description : ");
            disk.description = input.next();
            System.out.print("Producer : ");
            disk.producer = input.next();
            System.out.print("Price : ");
            disk.priceInfo = input.next();
            System.out.print("Album TItle : ");
            disk.albumTitle = input.next();
            System.out.print("Singer : ");
            disk.singer = input.next();

            productList.add(disk);
        }
        else if(productCode == 3) {
            ConversationBook conversationBook = new ConversationBook(10011);
            conversationBook.idNum = idNum;
            System.out.print("Description : ");
            conversationBook.description = input.next();
            System.out.print("Producer : ");
            conversationBook.producer = input.next();
            System.out.print("Price : ");
            conversationBook.priceInfo = input.next();
            System.out.print("Title : ");
            conversationBook.bookTitle = input.next();
            System.out.print("Author : ");
            conversationBook.author = input.next();
            System.out.print("Language : ");
            conversationBook.language = input.next();

            productList.add(conversationBook);
        }
        else {
            System.out.println("지원하지않는 상품코드입니다.");
        }
    }

    public void showInfo(Product product) {
        System.out.println("======상품정보========");
        System.out.println("Product Code : " + product.idNum);
        System.out.println("Description : " + product.description);
        System.out.println("Producer : " + product.producer);
        System.out.println("Price Info : " + product.priceInfo);
    }

    public void showAllInfo() {
        for(Product product : productList) {
            product.showInfo(product);
            if(product.idNum == 1) {
                Book book = (Book) product;
                book.showInfo(book);
            }
            else if(product.idNum == 2) {
                CompactDisc disk = (CompactDisc) product;
                disk.showInfo(disk);
            }
            else {
                ConversationBook book = (ConversationBook) product;
                book.showInfo(book);
            }
            System.out.println("");
        }
    }
}

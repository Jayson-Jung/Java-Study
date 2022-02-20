package chapter7.product;

public class Book extends Product{
    protected int ISBNNum;
    protected String author;
    protected String bookTitle;

    public Book(int ISBNNum) {
        this.ISBNNum = ISBNNum;
    }

    public void showInfo(Book book) {
        super.showInfo(book);
        System.out.println("========책의 정보입니다.=======");
        System.out.println("ISBNNum : " + book.ISBNNum);
        System.out.println("Author : " + book.author);
        System.out.println("Book Title : " + book.bookTitle);
    }
}

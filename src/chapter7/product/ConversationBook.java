package chapter7.product;

public class ConversationBook extends Book{
    String language;

    public ConversationBook(int ISBNNum) {
        super(ISBNNum);
    }

    public void showInfo(ConversationBook book) {
        System.out.println("============회화책의 정보입니다.==========");
        System.out.println("Language : " + book.language);
    }
}

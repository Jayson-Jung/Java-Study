package chapter7.product;

public class CompactDisc extends Product{

    String albumTitle;
    String singer;

    public void showInfo(CompactDisc disk) {
        super.showInfo(disk);
        System.out.println("======디스크의 정보입니다.=======");
        System.out.println("Album Title : " + disk.albumTitle);
        System.out.println("Singer : " + disk.singer);
    }
}

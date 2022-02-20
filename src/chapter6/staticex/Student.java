package chapter6.staticex;

public class Student {
    private static int serialNum = 10000;

    int studentId;
    String studentName;

    public Student() {
        serialNum++;
        studentId = serialNum;
    }

    public static int getSerialNum() {
        int i = 10;
        i++;
        System.out.println(i);
        //studentName = "홍길동"; // static 메소드에서는 멤버변수 사용불가
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}

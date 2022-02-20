package chapter6.staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentJ = new Student();
        System.out.println((studentJ.studentId));

        Student studentT = new Student();
        System.out.println((studentT.studentId));

        System.out.println(Student.getSerialNum());
        System.out.println(Student.getSerialNum());
    }
}

package chapter13.lambda;

public class TestStringConcat {

    public static void main(String[] args) {
        StringConcatImpl sImpl = new StringConcatImpl();
        sImpl.makeString("hello", "java");

        StringConCat concat = ((s1, s2) -> System.out.println(s1 + " " + s2));
        concat.makeString("hello", "java");
    }
}

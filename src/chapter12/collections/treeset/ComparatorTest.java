package chapter12.collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Mycompare implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2) * (-1);        //내림차순
    }
}

public class ComparatorTest {

    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(new Mycompare());

        tree.add("aaa");
        tree.add("ccc");
        tree.add("bbb");

        // 정렬이 되어 출력 : Comparable로 구현이 되어있다.
        System.out.println(tree);
    }
}

package chapter12.collections.treeset;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<>();

        tree.add("aaa");
        tree.add("ccc");
        tree.add("bbb");

        // 정렬이 되어 출력 : Comparable로 구현이 되어있다.
        System.out.println(tree);

    }
}

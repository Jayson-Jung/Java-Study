package chapter10.interfaceex.stack;

import java.util.ArrayList;

public interface Stack {
    ArrayList<Integer> stackList = new ArrayList<>();
    int length();
    void pop();
    boolean push(int num);
    void showStackInfo();
}

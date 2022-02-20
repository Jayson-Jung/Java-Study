package chapter10.interfaceex.stack;

import java.util.ArrayList;
import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new StackCalc();

        Scanner input = new Scanner(System.in);
        int ch;

        do {
            System.out.println("Push(1), Pop(2), 종료(3): ");
            ch = input.nextInt();
            if (ch == 1) {
                System.out.println("What number do you want to push : ");
                int num = input.nextInt();
                stack.push(num);
            } else if (ch == 2) {
                stack.pop();
            }
        } while(ch != 3);
    }
}

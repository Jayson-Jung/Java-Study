package chapter10.interfaceex.stack;

public class StackCalc implements Stack{
    @Override
    public int length() {
        return stackList.size();
    }

    @Override
    public void pop() {
        if(length() != 0) {
            stackList.remove(stackList.size() - 1);
        }
        else
            System.out.println("There is no number in Stack");
        showStackInfo();
    }

    @Override
    public boolean push(int num) {
        stackList.add(num);
        showStackInfo();
        return true;
    }

    @Override
    public void showStackInfo() {
        System.out.print("Stack List : ");
        for(int num : stackList) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}

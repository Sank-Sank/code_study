package stack;

import stack.ArrayStack;

import java.util.Random;

/**
 * 类描述: 栈的测试类
 * 作者: by Sank
 * 时间: 2019-02-12 11:34
 */
public class Test {
    private static double testStack(Stack<Integer> stack,int opCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 100000;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack,opCount);
        System.out.println("ArrayStack, time: " + time1 + " s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack,opCount);
        System.out.println("LindedListStack, time: " + time2 + " s");
    }

}

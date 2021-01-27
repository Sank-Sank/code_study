package stack;

import array.Array;

/**
 * 数组栈
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E>{

    Array<E> array;

    public ArrayStack(){
        array = new Array<>();
    }

    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("stack:");
        str.append("[");
        for(int i = 0;i < array.getSize();i++){
            str.append(array.get(i));
            if(i != array.getSize() - 1)
                str.append(", ");
        }
        str.append("] Top");
        return str.toString();
    }
}


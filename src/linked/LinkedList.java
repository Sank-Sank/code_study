package linked;

/**
 * 单向链表，带有虚拟头节点
 * @param <E>
 */
public class LinkedList<E> {
    //链表头
    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //向链表中添加元素
    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add Failed. Illegal index.");
        Node prev = dummyHead;
        for (int i = 0; i < index; i++)
            prev = prev.next;
        Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    //在链表头部添加元素
    public void addFirst(E e) {
        add(0, e);
    }


    public void addLast(E e) {
        add(size, e);
    }

    //获取链表中指定下标的元素
    public E get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("GET failed. Illegal index.");
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size -1);
    }

    /**
     * 更新指定下标的元素
     * @param index
     * @param e
     */
    public void set(int index,E e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Update failed. Illegal index.");
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    public boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur != null){
            if(cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    /**
     * 删除指定下标的元素
     */
    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Illegal index.");
        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node retNode = pre.next;
        pre.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }//0.22+0.06+0.29+0.76+0.25+0.04+0.07+0.03+2.56+0.05+0.09+0.36+5.83+0.16+0.08+0.01+1.07+5.36+0.28+0.04+0.1+1.1+4.12+0.23+0.04+0.1+2.26+0.03+4.24+0.15+0.05+2.39+0.03+0.24+0.04+0.37+0.29+2.94+0.07+0.15

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size - 1);
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }

    /**
     * 底层内部类
     */
    private class Node {
        public E e;
        private Node next;

        public Node() {
            this(null, null);
        }

        public Node(E e) {
            this(e, null);
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}

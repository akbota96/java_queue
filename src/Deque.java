// Java program to Implement a stack
// using singly linked list
// import package
import java.util.Iterator;

import static java.lang.System.exit;

public class Deque<Item> implements Iterable<Item> {

    @Override
    public Iterator<Item> iterator() {
        Iterator<Item> iterator = new Iterator<Item>() {
            Node currentElem = null;

            @Override
            public boolean hasNext() {
                if (currentElem == null) {
                    currentElem = top;
                } else {
                    currentElem = currentElem.linkNext;
                }
                return currentElem != null;
            }
            @Override
            public Item next() {
                return currentElem.data;
            }
        };
        return iterator;
    }

    private class Node {
        Item data; // integer data
        Node linkNext; // reference variable Node type
        Node linkPrev;
    }
    Node top;
    Node end;
    int size;

    public Deque()
    {
        this.top = null;
        this.end = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        Node temp = new Node();

        temp.data = item;
        temp.linkNext = top;

        if (top == null) {
            top = temp;
            end = top;
        } else {
            top.linkPrev = temp;
            top = temp;
        }
        size ++;
    }

    public void addLast(Item item){
        Node temp = new Node();

        temp.data = item;
        temp.linkPrev = end;

        if (end == null) {
            end = temp;
            top = end;

        } else {
            end.linkNext = temp;
            end = temp;
        }

        size++;
    }

    public Item removeFirst() {
        Item temp = top.data;
        top = top.linkNext;

        if (top == null) {
            end = null;
        } else {
            top.linkPrev = null;
        }
        size--;
        return temp;
    }

    public Item removeLast() {

        Item temp = end.data;
        end = end.linkPrev;
        if (end == null) {
            top = null;
        } else {
            end.linkNext = null;
        }
        size--;
        return temp;

    }

    public static void main(String[] args)
    {
        Deque<Integer> obj = new Deque<>();

        obj.addFirst(11);
        obj.addFirst(22);
        obj.addFirst(33);
        obj.addFirst(44);

//        obj.removeFirst();
//        obj.removeLast();
//        obj.removeFirst();
//        obj.removeLast();

        for (Integer x: obj) {
            System.out.println(x);
        }

    }
}

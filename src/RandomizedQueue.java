// Java program to Implement a stack
// using singly linked list
// import package
import java.util.Iterator;

import static java.lang.System.exit;

public class RandomizedQueue<Item> implements Iterable<Item> {

    @Override
    public Iterator<Item> iterator() {
        Iterator<Item> iterator = new Iterator<Item>() {
            int curIndex = 0;
            int[] inds = new int[size];

            @Override
            public boolean hasNext() {
                if (curIndex == 0) {
                    for(int i = 0; i < size; i++){
                        inds[i] = i;
                    }
                    StdRandom.shuffle(inds);
                }

                if (curIndex == size) {
                    return false;
                }

                if (arr[inds[curIndex]] == null) {
                    return false;
                } else {
                    curIndex++;
                    return true;
                }

            }

            @Override
            public Item next() {
                return arr[inds[curIndex - 1]];
            }
        };
        return iterator;
    }

    int size;
    Item[] arr;

    public RandomizedQueue()
    {
        this.size = 0;
        this.arr = (Item[]) new Object[100];
    }

    public void enqueue(Item item) {
        if (size == arr.length) {
            Item[] arrNew = (Item[]) new Object[arr.length + 100];

            for (int i = 0; i < size; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
        }
        arr[size] = item;
        size ++;
    }

    public Item dequeue(){
        int randIndex = StdRandom.uniform(size);
        Item answer = arr[randIndex];
        arr[randIndex] = arr[size-1];
        size--;
        return answer;
    }

    public static void main(String[] args)
    {
        RandomizedQueue<Integer> obj = new RandomizedQueue<>();
        obj.enqueue(11);
        obj.enqueue(12);
        obj.enqueue(13);
        obj.enqueue(14);


        for (Integer x: obj) {
            System.out.println(x);
        }

    }
}

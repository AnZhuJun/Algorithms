package search;

import datastructure.Queue;

import java.util.Iterator;

public class BinarySearchST<Key extends Comparable<Key>,Value>{
    private Key[] keys;
    private Value[] values;
    private int N = 0;

    public BinarySearchST(int capacity){
        keys = (Key[]) new Comparable[capacity];
        values = (Value[]) new Object[capacity];
    }

    public void sys(){
        for(int i = 0; i < N ; i++) {
            System.out.println(keys[i]);
        }
    }

    public Key min(){
        return keys[0];
    }

    public Key max(){
        return keys[N-1];
    }

    public Key select(int k){
        return keys[k];
    }

    public Key ceiling(Key key){
        int i = rank(key);
        return keys[i];
    }

    public Iterable<Key> keys(Key lo,Key hi){
        Queue<Key> q = new Queue<>();
        for(int i = rank(lo);i < rank(hi); i++)
            q.enqueue(keys[i]);
        if(contains(hi))
            q.enqueue(keys[rank(hi)]);
        return q;
    }

    private boolean contains(Key hi) {
        return get(hi)!=null;
    }

    public int size(){
        return N;
    }

    public int rank(Key key){
        int lo=0,hi=N-1;

        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            int cmp = key.compareTo(keys[mid]);
            if(cmp < 0)
                hi = mid - 1;
            else if(cmp > 0)
                lo = mid + 1;
            else
                return mid;
        }

        return lo;
    }

    public Value get(Key key){
        if(isEmpty())
            return null;
        int i = rank(key);
        if(i < N && keys[i].compareTo(key) == 0)
            return values[i];
        else
            return null;
    }

    public void put(Key key,Value value){
        int i = rank(key);
        if(i < N && keys[i].compareTo(key)==0){
            values[i] = value;
            return;
        }

        for(int j =N;j>i;j--){
            keys[j] = keys[j-1];
            values[j] = values[j-1];
        }

        keys[i] = key;
        values[i] = value;
        N++;
    }

    private boolean isEmpty() {
        return N == 0;
    }

    public static void main(String[] args) {
        BinarySearchST binarySearchST = new BinarySearchST(10);

        binarySearchST.put(1,1);
        binarySearchST.put(3,3);
        binarySearchST.put(7,7);
        binarySearchST.put(9,9);
        binarySearchST.put(4,4);
        binarySearchST.put(6,6);
        binarySearchST.put(5,5);
        binarySearchST.put(2,2);
        binarySearchST.put(8,8);
        binarySearchST.put(10,10);

        binarySearchST.sys();
        System.out.println("max " + binarySearchST.max());
        System.out.println("min " + binarySearchST.min());
    }
}

package datastructure;

import java.util.Iterator;

public class Queue1<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;

    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void enqueue(Item item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;

        if(isEmpty()){
            first = last;
        }else{
            oldLast.next = last;
        }

        N++;
    }

    public Item dequeue(){
        Item node = first.item;
        first = first.next;
        if(isEmpty())
            last = null;

        N--;
        return node;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    public static void main(String[] args) {
        Queue1<String> queue1 = new Queue1<>();
        queue1.enqueue("a");
        queue1.enqueue("b");
        queue1.enqueue("d");
        queue1.enqueue("e");
        queue1.enqueue("f");
        queue1.enqueue("c");

        while(!queue1.isEmpty())
            System.out.println(queue1.dequeue());
    }
}

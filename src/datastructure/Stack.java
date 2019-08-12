package datastructure;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
    private Node first;
    private int N;

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            Item item  = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
        }
    }

    private class Node {
        Item item;
        Node next;

    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("s");
        s.push("t");
        s.push("a");
        s.push("c");
        s.push("k");
        Iterator<String> iterator = s.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
}


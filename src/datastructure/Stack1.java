package datastructure;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

import java.util.Iterator;

public class Stack1<Item> implements Iterable<Item> {
    private Node first;
    private int N;

    public class Node{
        Item item;
        Node next;
    }

    private boolean isEmpty(){
        return first == null;
    }

    private int size(){
        return N;
    }

    private void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;

        N++;
    }

    private Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

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
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        Stack1<String> stack1 = new Stack1<>();
        stack1.push("a");
        stack1.push("g");
        stack1.push("s");
        stack1.push("w");
        stack1.push("d");
        stack1.push("c");

        Iterator<String> iterator = stack1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        while(!stack1.isEmpty())
//            System.out.println(stack1.pop());
    }
}

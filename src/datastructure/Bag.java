package datastructure;

import java.util.Iterator;
import java.util.ListIterator;

public class Bag<Item> implements Iterable<Item> {
    private Node first;

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class Node{
        Item item;
        Node next;
    }

    public void add(Item item){
        Node oldFirst = first;
        first.item = item;
        first.next = oldFirst;
    }


    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        bag.add("a");
        bag.add("b");
        bag.add("c");
        bag.add("d");

//        System.out.println(bag);
    }
}

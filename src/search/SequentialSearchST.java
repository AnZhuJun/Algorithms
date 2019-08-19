package search;

public class SequentialSearchST<Key,Value> {
    private Node first;

    private class Node{
        Key key;
        Value val;
        Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public Value get(Key key){
        for(Node x=first;x!=null;x=x.next){
            if(key.equals(x.key))
                return x.val;
        }

        return null;
    }

    public void put(Key key,Value value){
        for(Node x = first; x!=null; x = x.next){
            if (key.equals(x.key))
                x.val = value;
        }

        first = new Node(key,value,first);
    }

    public static void main(String[] args) {
        SequentialSearchST st = new SequentialSearchST();
        st.put(1,1);
        st.put(2,2);
        st.put(6,6);
        st.put(4,4);
        st.put(5,5);
        st.put(9,9);

        while(st.first.next!=null) {
            System.out.println(st.first.val);
            st.first = st.first.next;
        }
    }
}

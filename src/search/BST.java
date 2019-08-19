package search;

public class BST<Key extends Comparable<Key>,Value> {
    private Node root;

    private class Node{
        private Key key;
        private Value value;
        private Node left,right;
        private int N;

        public Node(Key key, Value value, int n) {
            this.key = key;
            this.value = value;
            N = n;
        }
    }

    public int size(){
        return size(root);
    }

    private int size(Node x){
        if(x == null)
            return 0;
        else
            return x.N;
    }

    public Value get(Key key){
        return get(root,key);
    }

    private Value get(Node x,Key key){
        if(x == null)
            return null;
        int cmp = key.compareTo(x.key);
    }

}

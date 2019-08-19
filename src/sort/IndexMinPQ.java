package sort;

public class IndexMinPQ<Key extends Comparable<Key>>{
    private int[] pq;
    private int N;
    private int[] qp;
    private Key[] keys;

    public IndexMinPQ(int N){
        keys = (Key[]) new Comparable[N+1];
        pq = new int[N + 1];
        qp = new int[N + 1];
        for(int i = 0; i <= N;i++)
            qp[i] = -1;
    }

    private boolean contains(int k){
        return qp[k]!=-1;
    }

    private boolean isEmpty(){
        return N == 0;
    }

    private int size(){
        return N;
    }

    private Key min(){
        return keys[1];
    }

    public void delete(int k){

    }
}

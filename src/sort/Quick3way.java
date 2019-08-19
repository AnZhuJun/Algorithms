package sort;

import java.util.Scanner;

import static sort.Example.exch;
import static sort.Example.isSorted;
import static sort.Example.show;

public class Quick3way {
    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a,int lo,int hi){
        if(lo >= hi)
            return;

        int lt = lo,i = lo + 1,gt = hi;
        Comparable v = a[lo];
        while(i <= gt){
            int cmp = a[i].compareTo(v);
            if(cmp < 0)
                exch(a,lt++,i++);
            else if(cmp > 0)
                exch(a,gt--,i);
            else
                i++;
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);
    }

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        String[] b = a.split(" ");
        sort(b);
        assert isSorted(b);
        show(b);
    }

}

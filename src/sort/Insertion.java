package sort;

import java.util.Scanner;

import static sort.Example.*;

public class Insertion {
    public static void sort(Comparable[] a){
        int N = a.length;

        for(int i = 1; i < N; i++){
            for(int j = i; j > 0 && less(a[j],a[j-1]); j--){
                exch(a,j,j-1);
            }
        }
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

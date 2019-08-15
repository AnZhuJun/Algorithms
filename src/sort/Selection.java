package sort;

import java.util.Scanner;

import static sort.Example.*;

public class Selection {
    public static void sort(Comparable[] a){
        int N = a.length;

        for(int i = 0; i < N ; i++){
            int min = i;
            for(int j = i ; j < N ; j++){
                if (less(a[j],a[min])){
                    min = j;
                }
                exch(a,min,i);
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

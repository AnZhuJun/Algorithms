package sort;

import java.util.Scanner;

import static sort.Example.*;
import static sort.Example.show;

public class Shell {
    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while(h < N/3)
            h = 3*h + 1;
        while(h >= 1){
            for(int i = h; i < N;i++)
            {
                for(int j = i;j>=h&&less(a[j],a[j-h]);j-=h)
                    exch(a,j,j-h);
            }
            h = h/3;
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

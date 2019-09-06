package sort;

import java.util.Scanner;

import static sort.Example.*;

public class Inseration1 {
    private static void sort(Comparable[] comparables){
        int N = comparables.length;
        for(int i = 1;i < N ;i++){
            for(int j = i; j > 0 && less(comparables[j],comparables[j-1]);j--){
                exch(comparables,j,j-1);
            }
        }
    }

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        String[] b = a.split(" ");
        sort(b);
        assert isSorted(b);
        show(b);
    }
}

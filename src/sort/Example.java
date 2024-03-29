package sort;

import java.util.Scanner;

public class Example {
    public static void sort(Comparable[] a){

    }

    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] +" ");
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i =1;i<a.length; i++){
            if(less(a[i],a[i-1]))
                return false;
        }
        return true;
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


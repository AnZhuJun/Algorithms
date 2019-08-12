import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,3,5,6,7,9,10};
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        input.nextLine();

        System.out.println(search(num,a));
    }

    private static int search(int num, int[] a) {
        int low = 0,high = a.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(num > a[mid]){
                low = mid + 1;
            }else if(num < a[mid]){
                high = mid - 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}

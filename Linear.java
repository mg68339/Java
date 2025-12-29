import java.util.*;

public class Linear {
    public static void linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.err.println("Element " + num + " Found at " + i + "th position");
            } else {
                System.out.println("Seems like it does not exist in this array");
                break;
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value at " + i + " th position : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Element to be searched : ");
        num = sc.nextInt();
        linearSearch(arr, num);
    }
}

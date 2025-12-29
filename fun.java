import java.util.*;

public class fun {
    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1:");
        int n1 = sc.nextInt();
        System.out.print("Enter the value of n2:");
        int n2 = sc.nextInt();

        int sum = add(n1, n2);
        System.out.println("the sum of " + n1 + " and " + n2 + " is " + sum);
        System.out.println("the Product of " + n1 + " and " + n2 + " is " + mul(n1, n2));
    }
}

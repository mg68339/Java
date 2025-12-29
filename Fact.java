import java.util.*;

public class Fact {
    public static int factorialOfNumber(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to get the factorial : ");
        int num = sc.nextInt();

        if (num > 0) {
            int fact = factorialOfNumber(num);
            System.err.println("The Factorial of the given Number " + num + " is : " + fact);

        } else {
            System.err.println("Invalid Input");
        }

    }
}

import java.util.*;

public class twoDarry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the row size of the array");
        int row = sc.nextInt();

        System.err.println("Enter the column size of the array");
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.err.println("enter the element to be searched : ");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == x) {
                    System.err.print("element found at ( " + i + " , " + j + " )");
                }
            }
            System.out.println();
        }

    }
}

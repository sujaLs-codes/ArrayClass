import java.util.Scanner;

public class TwoDimenArr2 {
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Matrix elements :");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("Matrix: \n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
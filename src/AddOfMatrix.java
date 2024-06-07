import java.awt.*;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class AddOfMatrix {
    public static void main(String[] args) {

        int a[][] = new int[4][4];
        int b[][] = new int[4][4];
        int c[][] = new int[4][4];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st matrix of data :- ");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter 2nd matrix data :- ");
        for(int i = 0;i < 4;i++)
        {
            for (int j = 0; j < 4; j++)
            {
                b[i][j] = s.nextInt();
            }
        }

        System.out.println("\n First Matrix is :- ");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(a[i][j] + " ");
                System.out.print("");
            }
            System.out.println("");
        }

        System.out.println("\n Second Matrix is :- ");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(b[i][j] + " ");
                System.out.print("");
            }
            System.out.println(" ");
        }

        System.out.println("\n Addition of Matrix is : ");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] +  " ");
            }
            System.out.print("\n");
        }
    }
}

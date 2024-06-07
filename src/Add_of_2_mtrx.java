import java.util.Scanner;

public class Add_of_2_mtrx {
    public static void main(String[] args) {

       int mat1[][] = new int[2][3];
       int mat2[][] = new int[2][3];
       int mat3[][] = new int[2][3];

       Scanner S = new Scanner(System.in);

       System.out.println("Enter the First Matrixes below := ");
       for(int i = 0;i < 2;i++)
       {
           for (int j = 0; j < 3; j++)
           {
               mat1[i][j] = S.nextInt();
               System.out.print("The first matrix is = " + mat1[i][j] + " ");
               System.out.print(" ");
           }
           System.out.println("");
       }

       System.out.println("Enter the Second matrix given below := ");
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                mat2[i][j] = S.nextInt();
                System.out.print("The second metrix is = " + mat2[i][j] + " ");
                System.out.print(" ");
            }
            System.out.println("");
        }

        System.out.println("The addition of matrix is :- ");
        for(int i = 0;i < 2;i++)
        {
            for (int j = 0; j < 3; j++)
            {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print("The addition of matrix is :- " + mat3[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

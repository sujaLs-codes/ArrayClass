import java.util.Scanner;

public class TwoDimen_String {
    public static void main(String[] args) {

        String [][]name = new String[10][20];

        Scanner S = new Scanner(System.in);
        System.out.println("Enter the names :-");

        for (int i = 0; i < name.length; i++)
        {
            for (int j = 0; j < name[i].length; j++)
            {
                name[i][j] = S.nextLine();
            }
        }

        for (int i = 0; i < name.length; i++)
        {
            for (int j = 0; j < name[i].length; j++)
            {
                System.out.print(name[i][j] + " ");
                System.out.print(" ");;
            }
            System.out.println(" ");
        }
    }
}

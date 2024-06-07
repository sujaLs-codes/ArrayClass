import java.util.Scanner;
public class Array_Ticekt {
    public static void main(String[] args) {
     int[][] seats = {
                        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
                };
                Scanner sc = new Scanner(System.in);
                
                //your code goes here
                int one = sc.nextInt();
                int two = sc.nextInt();
                if (seats[one][two] == 0)
                {
                    System.out.println("Free");
                }
                else
                {
                    System.out.println("Sold");
                }
    }
}

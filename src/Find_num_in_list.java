import java.util.Scanner;

public class Find_num_in_list {
    public static void main(String[] args) {

        int [] marks = {10,20,30,40,50,60,70};
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the missing number ");
        num =  sc.nextInt();

        boolean IsInArray = false;

        for(int element : marks)
        {
            if(num == element)
            {
                IsInArray = true;
                break;
            }
        }
        if(IsInArray)
        {
            System.out.println("The number is in the ARRAY");
        }
        else {
            System.out.println("The number is not in the ARRAY");
        }
    }
}

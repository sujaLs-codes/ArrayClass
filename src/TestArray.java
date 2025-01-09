import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of arr : ");
        a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[a] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

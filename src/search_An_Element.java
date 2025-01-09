public class search_An_Element {
    static int findElement(int arr[] , int n, int key)
    {
        int i;
        for (i = 0; i < n; i++)
            if(arr[i] == key)
                return i;

            return -1;
    }
}

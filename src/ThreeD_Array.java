public class ThreeD_Array {
    public static void main(String[] args) {

        int[][][] threeDArray = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };

        // Display the elements of the 3D array
        System.out.println("Elements of the 3D array:");

        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();  // Move to the next line after each row
            }
            System.out.println();  // Add an empty line between 2D arrays
        }
    }
}

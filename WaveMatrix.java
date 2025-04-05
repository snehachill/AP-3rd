public class WaveMatrix {
    public static void printWave(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            // If the row index is even, traverse left to right
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } 
            // If the row index is odd, traverse right to left
            else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        // Print a newline for better output formatting
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        printWave(matrix);
    }
}
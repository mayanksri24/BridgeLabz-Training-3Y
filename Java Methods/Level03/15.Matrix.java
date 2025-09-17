import java.util.*;

public class MatrixOperations {

    // Method to create a random matrix
    static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random numbers [0–9]
            }
        }
        return matrix;
    }

    // Method to add two matrices
    static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix multiplication not possible: Columns of A != Rows of B");
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and cols of matrices: ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        // Create two random matrices
        int[][] A = createRandomMatrix(rows, cols);
        int[][] B = createRandomMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);

        // Addition
        System.out.println("A + B:");
        displayMatrix(addMatrices(A, B));

        // Subtraction
        System.out.println("A - B:");
        displayMatrix(subtractMatrices(A, B));

        // Multiplication (only if valid)
        try {
            System.out.println("A x B:");
            displayMatrix(multiplyMatrices(A, B));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

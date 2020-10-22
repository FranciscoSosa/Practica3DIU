package practica3;

import java.util.concurrent.ThreadLocalRandom;


public class Matrix {

    public Matrix(int min, int max) {
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix1[j] = ThreadLocalRandom.current().nextInt(min, max + 1);
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }
    
    public String filter(int treshold){
        StringBuilder matrixBuilder = new StringBuilder(1000);
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixBuilder.append(matrix1[j] > treshold ? String.format(" %d ", matrix1[j])
                       : " - ");
            }
            matrixBuilder.append("\n"); 
        }
        return matrixBuilder.toString();
    }
    
    private final int[][] matrix = new int[10][10];  
}

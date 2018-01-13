package weekendAssignemnt2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangjunxu on 1/13/18.
 */
public class SpiralMatrix {
    private int[][] matrix;
    private List<Integer> result;

    /**
     * take user input
     * @param matrix
     */
    public void input(int[][] matrix) {
        this.matrix = matrix;
        this.result = new ArrayList<>();
    }

    /**
     * Implements logic here
     */
    public void logic() {
        int rowBeging = 0;
        int rowEnd = matrix.length - 1;
        int colBeging = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBeging <= rowEnd && colBeging <= rowEnd) {
            for (int i = colBeging; i <= colEnd; i++) {
                result.add(matrix[rowBeging][i]);
            }
            rowBeging++;

            for (int i = rowBeging; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowBeging <= rowEnd) {
                for (int i = colEnd; i >= colBeging; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (colBeging <= colEnd) {
                for (int i = rowEnd; i >= rowBeging; i--) {
                    result.add(matrix[i][colBeging]);
                }
            }
            colBeging++;
        }
    }

    /**
     * show result to user
     */
    public void output() {
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        spiralMatrix.input(matrix);
        spiralMatrix.logic();
        spiralMatrix.output();
    }
}

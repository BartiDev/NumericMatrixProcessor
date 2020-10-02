package processor.utils.matrixTransposing;

import processor.utils.ArrayCloner;

public class VerticalLine implements Transposer {

    @Override
    public double[][] transpose(double[][] matrix) {
        double[][] result = new ArrayCloner().copy(matrix);

        int k;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                k = matrix.length -1 - j;
                result[i][j] = matrix[i][k];
            }
        }
        return result;
    }
}

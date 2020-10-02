package processor.utils.matrixTransposing;

import processor.utils.ArrayCloner;

public class SideDiagonal implements Transposer {

    @Override
    public double[][] transpose(double[][] matrix) {
        double[][] result = new ArrayCloner().copy(matrix);

        int k;
        int l;
        for (int i = 0; i < matrix.length; i++) {
            l = matrix.length -1 - i;
            for (int j = 0; j < matrix.length; j++) {
                k = matrix.length -1 - j;
                result[i][j] = matrix[k][l];
            }
        }
        return result;
    }
}

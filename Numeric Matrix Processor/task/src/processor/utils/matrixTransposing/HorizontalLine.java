package processor.utils.matrixTransposing;

import processor.utils.ArrayCloner;

public class HorizontalLine implements Transposer {

    @Override
    public double[][] transpose(double[][] matrix) {
        double[][] result = new ArrayCloner().copy(matrix);

        int k;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                k = matrix.length -1 - j;
                result[j][i] = matrix[k][i];
            }
        }
        return result;
    }
}

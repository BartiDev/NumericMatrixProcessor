package processor.utils.matrixTransposing;
import processor.utils.ArrayCloner;

public class MainDiagonal implements Transposer {

    @Override
    public double[][] transpose(double[][] matrix) {
        double[][] result = new ArrayCloner().copy(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}

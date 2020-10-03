package processor.utils.matrixOperations;

public class MultiplyByConstant {

    public double[][] execute(double[][] matrix, double constant) {
        double[][] result = new double[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[i][j] * constant;
            }
        }

        return result;
    }
}

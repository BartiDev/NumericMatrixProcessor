package processor.utils.matrixOperations;

public class Sum {

    public double[][] execute(double[][] matrixA, double[][] matrixB) {
        double[][] result = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }
}

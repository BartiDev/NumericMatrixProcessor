package processor.utils.matrixOperations;

public class Multiply {

    public double[][] execute(double[][] matrixA, double[][] matrixB) {
        int matrixARows = matrixA.length;
        int matrixBColumns = matrixB[0].length;
        int matrixAColumns = matrixA[0].length;

        double[][] result = new double[matrixARows][matrixBColumns];

        double temp;
        for (int i = 0; i < matrixARows; i++) {
            for (int j = 0; j < matrixBColumns; j++) {
                temp = 0;
                for (int k = 0; k < matrixAColumns; k++) {
                    temp += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = temp;
            }
        }

        return result;
    }
}

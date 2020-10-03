package processor.utils.matrixInverse;

public class IdentityMatrixConstructor {

    public double[][] construct(int len) {
        double[][] result = new double[len][len];
        int temp;
        int diagonalIndex = 0;

        for (int i = 0; i < len; i++) {
            temp = 0;
            for (int j = 0; j < len; j++) {
                if (j == diagonalIndex) {
                    temp = 1;
                }
                result[i][j] = temp;
                temp = 0;
            }
            diagonalIndex++;
        }

        return result;
    }
}

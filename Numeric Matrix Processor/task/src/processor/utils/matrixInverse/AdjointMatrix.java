package processor.utils.matrixInverse;
import processor.utils.matrixDeterminant.Determinant;
import processor.utils.matrixDeterminant.MinorMatrixConstructor;

public class AdjointMatrix {

    public double[][] construct(double[][] arr) {

        Determinant determinant = new Determinant();

        int len = arr.length;
        double[][] result = new double[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                result[i][j] = Math.pow(-1, i + j) * determinant.determine(MinorMatrixConstructor.construct(arr, i, j));
            }
        }

        return result;

    }
}

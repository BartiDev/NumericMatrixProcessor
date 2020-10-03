package processor.utils.matrixDeterminant;

public class MinorMatrixConstructor {

    public static double[][] construct(double[][] base, int r, int c) {
        double[][] result = new double[base.length -1][base[0].length -1];
        int resultLen = result.length ;
        int rIndex = 0;

        for (int i = 0; i < resultLen; i++) {
            int cIndex = 0;
            if (i == r) {
                rIndex++;
            }
            for (int j = 0; j < resultLen; j++) {
                if (j == c) {
                    cIndex++;
                }
                result[i][j] = base[rIndex][cIndex];
                cIndex++;
            }
            rIndex++;
        }
        return result;
    }
}

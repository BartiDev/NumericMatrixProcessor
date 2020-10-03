package processor.utils.matrixInverse;

import processor.utils.matrixDeterminant.BaseDeterminer;
import processor.utils.matrixDeterminant.MinorMatrixConstructor;

public class Cofactor {

    public double calculateCofactor(double[][] arr, int r, int c) {

        BaseDeterminer baseDeterminer = new BaseDeterminer();
        double result = 0;
        int len = arr.length;

        if (len == 2) {
            return baseDeterminer.determine(arr);
        } else {
            double[][] minor = MinorMatrixConstructor.construct(arr, r, c);
            result += Math.pow(-1,r + c) * calculateCofactor(minor, r, c);
        }
        return result;

    }
}

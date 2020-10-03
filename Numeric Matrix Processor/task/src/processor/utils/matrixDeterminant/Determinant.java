package processor.utils.matrixDeterminant;

public class Determinant {

    public double determine(double[][] arr) {

        BaseDeterminer baseDeterminer = new BaseDeterminer();
        double result = 0;
        int len = arr.length;

        if (len == 2) {
            return baseDeterminer.determine(arr);
        } else {
            for (int i = 0; i < arr.length; i++) {
                double[][] minor = MinorMatrixConstructor.construct(arr, 0, i);
                result += Math.pow(-1,i) * arr[0][i] * determine(minor);
            }
        }
        return result;

    }
}

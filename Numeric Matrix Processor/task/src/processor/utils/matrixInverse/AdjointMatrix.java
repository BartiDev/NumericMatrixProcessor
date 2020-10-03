package processor.utils.matrixInverse;

public class AdjointMatrix {

    public double[][] construct(double[][] arr) {

        Cofactor cofactor = new Cofactor();

        int len = arr.length;
        double[][] result = new double[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                result[i][j] = cofactor.calculateCofactor(arr, i, j);
            }
        }

        return result;

    }
}

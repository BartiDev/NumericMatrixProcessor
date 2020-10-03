package processor.utils.matrixDeterminant;

public class BaseDeterminer {

    public double determine(double[][] arr) {
        return arr[0][0] * arr[1][1] - arr[1][0] * arr[0][1];
    }
}

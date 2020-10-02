package processor.utils;

public class Printer {

    public void print(double[][] matrix) {

        String temp;
        for (double[] ints : matrix) {
            temp = "";
            for (double anInt : ints) {
                if (anInt % 1 == 0) {
                    temp += String.format("%d", (int) anInt) + " ";
                } else {
                    temp += anInt + " ";
                }
            }
            System.out.println(temp);
        }
    }
}

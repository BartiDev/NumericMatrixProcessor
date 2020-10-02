package processor.utils;

import java.util.Scanner;

public class Builder {

    public double[][] buildMatrix (int m, int n) {
        Scanner scanner = new Scanner(System.in);
        double[][] result = new double[m][n];
        String[] input;

        for (int i = 0; i < m; i++) {
            String temp = scanner.nextLine();
            input = temp.split(" ");
            for (int j = 0; j < n; j++) {
                result[i][j] = Double.parseDouble(input[j]);
            }
        }
        return result;
    }
}

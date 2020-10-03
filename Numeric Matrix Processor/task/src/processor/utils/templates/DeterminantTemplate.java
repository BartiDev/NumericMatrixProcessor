package processor.utils.templates;

import processor.utils.Builder;
import processor.utils.Printer;
import processor.utils.matrixDeterminant.Determinant;
import processor.utils.matrixTransposing.Transposer;

import java.util.Scanner;

public class DeterminantTemplate {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Builder builder = new Builder();
        Printer printer = new Printer();
        Determinant determinant = new Determinant();

        System.out.println("Enter size of matrix: ");
        String nmA = scanner.nextLine();
        String[] nmArrA = nmA.split(" ");
        int mA = Integer.parseInt(nmArrA[0]);
        int nA = Integer.parseInt(nmArrA[1]);
        double[][] matrix = builder.buildMatrix(mA, nA);

        System.out.println("The result is: ");
        System.out.println(determinant.determine(matrix));

    }
}

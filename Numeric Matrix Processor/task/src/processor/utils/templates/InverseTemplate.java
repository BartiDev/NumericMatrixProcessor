package processor.utils.templates;
import processor.utils.Builder;
import processor.utils.Printer;
import processor.utils.matrixDeterminant.Determinant;
import processor.utils.matrixInverse.AdjointMatrix;
import processor.utils.matrixOperations.MultiplyByConstant;
import processor.utils.matrixTransposing.MainDiagonal;
import processor.utils.validators.Inversable;

import java.util.Scanner;

public class InverseTemplate {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Builder builder = new Builder();
        Printer printer = new Printer();
        AdjointMatrix adjMatrix = new AdjointMatrix();
        MainDiagonal transposer = new MainDiagonal();
        Determinant determinant = new Determinant();
        MultiplyByConstant multiply = new MultiplyByConstant();
        Inversable inversable = new Inversable();
        System.out.println("Enter size of matrix: ");
        String nmA = scanner.nextLine();
        String[] nmArrA = nmA.split(" ");
        int mA = Integer.parseInt(nmArrA[0]);
        int nA = Integer.parseInt(nmArrA[1]);
        double[][] matrix = builder.buildMatrix(mA, nA);
        double det = determinant.determine(matrix);
        double scalar = 1.0 / det;
        System.out.println("The result is: ");

        if (inversable.check(det)) {
            printer.print(multiply.execute(
                    transposer.transpose(
                    adjMatrix.construct(matrix)), scalar));

        } else {
            System.out.println("This matrix doesn't have an inverse.");
        }
    }
}

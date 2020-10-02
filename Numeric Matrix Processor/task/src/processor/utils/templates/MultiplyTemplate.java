package processor.utils.templates;
import processor.utils.Builder;
import processor.utils.Printer;
import processor.utils.matrixOperations.MultiplyByConstant;

import java.util.Scanner;

public class MultiplyTemplate {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Builder builder = new Builder();
        MultiplyByConstant multiply = new MultiplyByConstant();
        Printer printer = new Printer();

        String nmA = scanner.nextLine();
        String[] nmArrA = nmA.split(" ");
        int mA = Integer.parseInt(nmArrA[0]);
        int nA = Integer.parseInt(nmArrA[1]);
        double[][] matrix = builder.buildMatrix(mA, nA);
        int constant = scanner.nextInt();

        printer.print(multiply.execute(matrix,constant));

    }
}

package processor.utils.templates;

import processor.utils.Builder;
import processor.utils.Printer;
import processor.utils.matrixTransposing.Transposer;

import java.util.Scanner;

public class TransposeTemplate {

    public void execute(Transposer transposer) {
        Scanner scanner = new Scanner(System.in);
        Builder builder = new Builder();
        Printer printer = new Printer();

        System.out.println("Enter size of matrix: ");
        String nmA = scanner.nextLine();
        String[] nmArrA = nmA.split(" ");
        int mA = Integer.parseInt(nmArrA[0]);
        int nA = Integer.parseInt(nmArrA[1]);
        double[][] matrix = builder.buildMatrix(mA, nA);

        System.out.println("The result is: ");
        printer.print(transposer.transpose(matrix));

    }
}

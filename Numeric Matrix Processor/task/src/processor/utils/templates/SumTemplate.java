package processor.utils.templates;

import processor.utils.Builder;
import processor.utils.validators.AdditionCompatibility;
import processor.utils.Printer;
import processor.utils.matrixOperations.Sum;

import java.util.Scanner;

public class SumTemplate {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Builder builder = new Builder();
        AdditionCompatibility compatibility = new AdditionCompatibility();
        Sum sum = new Sum();
        Printer printer = new Printer();

        System.out.println("Enter size of first matrix: ");
        String nmA = scanner.nextLine();
        String[] nmArrA = nmA.split(" ");
        int mA = Integer.parseInt(nmArrA[0]);
        int nA = Integer.parseInt(nmArrA[1]);
        double[][] matrixA = builder.buildMatrix(mA, nA);
        System.out.println("Enter size of second matrix: ");
        String nmB = scanner.nextLine();
        String[] nmArrB = nmB.split(" ");
        int mB = Integer.parseInt(nmArrB[0]);
        int nB = Integer.parseInt(nmArrB[1]);
        double[][] matrixB = builder.buildMatrix(mB, nB);

        if (compatibility.checkCompatibility(mA, nA, mB, nB)) {
            System.out.println("The addition result is: ");
            printer.print(sum.execute(matrixA, matrixB));
        } else {
            System.out.println("ERROR");
        }
    }
}

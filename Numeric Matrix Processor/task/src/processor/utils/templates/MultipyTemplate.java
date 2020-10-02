package processor.utils.templates;

import processor.utils.Builder;
import processor.utils.Printer;
import processor.utils.matrixOperations.Multiply;
import processor.utils.validators.MultiplicationCompatibility;

import java.util.Scanner;

public class MultipyTemplate {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Builder builder = new Builder();
        Multiply multiply = new Multiply();
        Printer printer = new Printer();
        MultiplicationCompatibility multiplicationCompatibility = new MultiplicationCompatibility();

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

        if (multiplicationCompatibility.checkCompatibility(nA, mB)) {
            System.out.println("The multiplication result is: ");
            printer.print(multiply.execute(matrixA, matrixB));
        } else {
            System.out.println("ERROR");
        }

    }
}

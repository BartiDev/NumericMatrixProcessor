package processor.utils.templates;
import processor.utils.Builder;
import processor.utils.Printer;
import processor.utils.matrixOperations.MultiplyByConstant;

import java.util.Scanner;

public class MultiplyByConstantTemplate {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Builder builder = new Builder();
        MultiplyByConstant multiply = new MultiplyByConstant();
        Printer printer = new Printer();

        System.out.println("Enter size of matrix: ");
        String nmA = scanner.nextLine();
        String[] nmArrA = nmA.split(" ");
        int mA = Integer.parseInt(nmArrA[0]);
        int nA = Integer.parseInt(nmArrA[1]);
        double[][] matrix = builder.buildMatrix(mA, nA);
        System.out.println("Enter constant: ");
        int constant = scanner.nextInt();

        System.out.println("The multiplication by a constant result is: ");
        printer.print(multiply.execute(matrix,constant));

    }
}

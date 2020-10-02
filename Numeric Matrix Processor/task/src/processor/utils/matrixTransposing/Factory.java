package processor.utils.matrixTransposing;

import java.util.Scanner;

public class Factory {

    public Transposer transposeFactory(int input) {

        switch (input) {
            case 1:
                System.out.printf("Your choice: %d\n", input);
                return new MainDiagonal();
            case 2:
                System.out.printf("Your choice: %d\n", input);
                return new SideDiagonal();
            case 3:
                System.out.printf("Your choice: %d\n", input);
                return new VerticalLine();
            case 4:
                System.out.printf("Your choice: %d\n", input);
                return new HorizontalLine();
            default:
                System.out.println("Wrong input");
                return null;
        }
    }
}

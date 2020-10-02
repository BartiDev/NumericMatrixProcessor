package processor.utils.strategy;

import processor.utils.matrixTransposing.Factory;
import processor.utils.templates.TransposeTemplate;

import java.util.Scanner;

public class TransposeStrategy {

    public void selectAction() {
        new TransposeMenu().printMenu();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        new TransposeTemplate().execute(new Factory().transposeFactory(input));
    }
}

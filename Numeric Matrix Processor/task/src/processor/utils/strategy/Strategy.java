package processor.utils.strategy;

import processor.utils.matrixOperations.Sum;
import processor.utils.matrixTransposing.Factory;
import processor.utils.templates.DeterminantTemplate;
import processor.utils.templates.MultiplyByConstantTemplate;
import processor.utils.templates.MultipyTemplate;
import processor.utils.templates.SumTemplate;

import java.util.Scanner;

public class Strategy {

    public void selectAction() {

        Menu menu = new Menu();
        int input;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            menu.printMenu();
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.printf("Your choice: %d\n", input);
                    new SumTemplate().execute();
                    break;
                case 2:
                    System.out.printf("Your choice: %d\n", input);
                    new MultiplyByConstantTemplate().execute();
                    break;
                case 3:
                    System.out.printf("Your choice: %d\n", input);
                    new MultipyTemplate().execute();
                    break;
                case 4:
                    System.out.printf("Your choice: %d\n", input);
                    new TransposeStrategy().selectAction();
                    break;
                case 5:
                    System.out.printf("Your choice: %d\n", input);
                    new DeterminantTemplate().execute();
                    break;
                case 0:
                    System.out.printf("Your choice: %d\n", input);
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }

    }
}

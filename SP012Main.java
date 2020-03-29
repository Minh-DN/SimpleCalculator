package sp012.simplecalculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class SP012Main {

    public static void main(String[] args) {
    
        // Getting user input (values for calculation)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        BigDecimal value1 = scanner.nextBigDecimal();
        System.out.print("Enter the second value: ");
        BigDecimal value2 = scanner.nextBigDecimal();
        String op;
        
        // Getting desired operator and performing operation
        do {
            System.out.print("Enter desired operator : ");
            op = scanner.next();
            switch (op) {
                case "+":
                    System.out.println("Result: " + value1.add(value2));
                    break;
                case "-":
                    System.out.println("Result: " + value1.subtract(value2));
                    break;
                case "*":
                    System.out.println("Result: " + value1.multiply(value2));
                    break;
                case "/":
                    System.out.println("Result: " + value1.divide(value2));
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
        } while (!op.matches("\\+|-|\\*|/"));
    }
}

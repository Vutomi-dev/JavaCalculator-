
import java.util.Scanner;

public class Calculator {
    public static void main(String[] arg) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("===Simple Java Calculator ===");
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter operator (+ ,- ,* , /): ");
            char operator = scanner.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double results;
            
            switch (operator) {
                case '+' -> results = num1 + num2;
                
                case '-' -> results = num1 - num2;
                
                case '*' -> results = num1 * num2;
                
                case '/' -> {
                    if (num2 !=0) {
                        results = num1/num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        return;
                        
                    }
                }
                default -> {
                    System.out.println("Invalid Operator!");
                    return;
                }
                
            }

            System.out.println("Results: " + results);
        }
        
    }

}

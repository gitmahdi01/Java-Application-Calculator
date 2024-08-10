import java.util.*;
import java.io.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.println("number of parameters");
        int param = calc.nextInt();

        double numbers[];
        numbers = new double[param];
        char operator[];
        operator = new char[param];


        System.out.println("Enter number 1");
        numbers[0]= calc.nextDouble();
        for (int i = 1; i < param; i++) {
            System.out.println("Enter the operator (+, -, *, /):");
            operator[i]= calc.next().charAt(0);
            System.out.println("Enter number "+(i+1));
            numbers[i]= calc.nextDouble();      
            
        }

        double result = numbers[0];

        for (int i = 0; i < param; i++) {
            switch (operator[i]) {
                case '*':
                    
                    result = result * numbers[i];
                    break;
                    case '/':
                    if (numbers[i] != 0) {
                        result =result / numbers[i];
                    } else {
                        System.out.println("Error! Division by zero.");
                        return;
                    }
                    
                    
                    break;
                    case '+':
                    result = result+ numbers[i];
                    
                    break;
                    case '-':
                    result = result - numbers[i];>
                    
                    break;
                
            
                default:
                    // System.out.println("Invalid Operator. use +,-,*,/");
                break;
                    
            }
            
        }
        System.out.println("The answer is: "+ result);
        


    }
    
    
}

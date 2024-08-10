import java.util.*;
import java.io.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.println("number of parameters");
        int param = calc.nextInt();

        // double numbers[];
        // numbers = new double[param];
        // char operator[];
        // operator = new char[param];

        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Character> operator = new ArrayList<>();


        System.out.println("Enter number 1");
        numbers.add(calc.nextDouble());
        for (int i = 1; i < param; i++) {
            System.out.println("Enter the operator (+, -, *, /):");
            operator.add(calc.next().charAt(0));
            System.out.println("Enter number "+(i+1));
            numbers.add(calc.nextDouble());      
            
        }

        double result = 0;

        for (int i = 0; i < operator.size() ; i++) {
            char operators = operator.get(i);

            if (operators =='*'|| operators == '/') {

                if (operators=='*') {
                    result = numbers.get(i) * numbers.get(i+1);
                    
                }else if (operators == '/') {
                    if (numbers.get(i) != 0) {
                        result =numbers.get(i) / numbers.get(i+1);
                    } else {
                        System.out.println("Error! Division by zero.");
                        return;
                    }

                    
                }
                numbers.set(i, result);
                numbers.remove(i + 1);
                operator.remove(i);
                i--;
  

                
            }
            result= numbers.get(0);
            for (int j = 0; j < operator.size(); j++) {
                char operatorss = operator.get(j);

                if (operatorss == '+') {
                    result += numbers.get(j + 1);
                    
                }else if (operatorss == '-') {
                    result -= numbers.get(j + 1);
                }
                
            }

            
        }
        System.out.println("The answer is: "+ result);
        


    }
    
    
}

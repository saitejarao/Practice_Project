package LVCAssign;

import java.util.Scanner;

public class Calculator {
     
	public static void main(String[] args) {
		double num1,num2,result;
	     char operator;
	     Scanner calculator=new Scanner(System.in);
	     System.out.println("Enter two numbers");
	     num1=calculator.nextDouble();
	     num2=calculator.nextDouble();
	     System.out.println("Enter operator");
	     operator=calculator.next().charAt(0);
		switch(operator) {
        case '+': result = num1 + num2;
           break;
        case '-': result= num1 - num2;
           break;
        case '*': result = num1 * num2;
           break;
        case '/': result = num1 / num2;
           break;
     default: System.out.printf("Error! Enter correct operator");
        return;
     }
     System.out.print("\nThe result is:\n");
     System.out.printf(num1 + " " + operator + " " + num2 + " = " + result);
	}

}

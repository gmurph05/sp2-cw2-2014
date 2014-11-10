package FractionCalculator;
import java.io.*;
import java.util.Scanner;

/**
 * @author gmurph05
 *
 */

public class FractionCalculator{

	public FractionCalculator() {
		// TODO Auto-generated constructor stub
		printStartMenu();
	}

	// start menu to prompt and instruct the user
	public void printStartMenu(){
		System.out.println("FRACTION CALCULATOR");
		System.out.println("-------------------------------");
		System.out.println("1. Add: + ");
		System.out.println("2. Subtract: - ");
		System.out.println("3. Multiply: * ");
		System.out.println("4. Divide: / ");
		System.out.println("- Use a space between fractions and operators.");
		System.out.println("- Use 'a','A', or 'abs' to get the absolute value of the fraction.");
		System.out.println("- Use 'n', 'N', or 'neg' to negate the fraction.");
		System.out.println("- Use 'c', 'C', or 'clear' to reset calculator to zero.");
		System.out.println("- Use 'q','Q', or 'quit' to cancel.");
		System.out.print("- Enter expression (press Enter to evaluate): ");
		Scanner in = new Scanner(System.in);
		String expression = in.nextLine();
		evaluate(expression);
		in.close();
	}
	
	public Fraction evaluate(String expression) {
		// TODO Auto-generated method stub
		Fraction answer = new Fraction(1,1);
		boolean q = false;
		boolean Q = false;
		boolean quit = false;
		
		String operator = "";
		
		Fraction Operand = new Fraction();
		
		while(!q || !Q || !quit){
			String[] parts = expression.split(" ");
			int count = 0;
			
			if(parts.length % 2 != 0){
				for(int i = 0; i < parts.length; i++){
					if(parts[i].length() > 1){
						String[] subPart1 = parts[i].split("/");
						String n1 = subPart1[0];
						String d1 = subPart1[1];
						Operand.setNumerator(Integer.parseInt(n1));
						Operand.setDenominator(Integer.parseInt(d1));
						Fraction f1 = new Fraction(Operand.getNumerator(),Operand.getDenominator());
						count++;
					}
					
					if(parts[i+2].length() > 1 && i+2 < parts.length){
						String[] subPart2 = parts[i].split("/");
						String n2 = subPart2[0];
						String d2 = subPart2[1];
						Operand.setNumerator(Integer.parseInt(n2));
						Operand.setDenominator(Integer.parseInt(d2));
						Fraction f2 = new Fraction(Operand.getNumerator(),Operand.getDenominator());
						count++;
					}
				operator = expression.substring(expression.indexOf(" ")+1);
	
				}
			
				if((q || Q || quit)){
					throw new IllegalArgumentException("operation terminated!");
				}
				return answer;
			}
		}
	}
	
	public void operator(String op){
		Fraction f1 = 
		String result = op;
		switch(op){
			case "*":	multiply();
			case "/":	divide();
			case "+": 	add();
			case "-":	subtract;
			default:	System.out.println("Invalid.");
		}
	}
	

}

// Tushar Garg, 23070126138, B3
// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Input input = new Input();
        
		System.out.println("What do you want to do? \n 1)Calculator \n2)fibonnaci \n3)Arrays");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		if (option == 1){
			
			System.out.println("Welcome to the Calculator!");

			double num1 = input.getDouble("Enter the first number: ");
			double num2 = input.getDouble("Enter the second number: ");
			char operation = input.getOperation();

			double result = 0;
			switch (operation) {
				case '+':
					result = calculator.add(num1, num2);
					break;
				case '-':
					result = calculator.subtract(num1, num2);
					break;
				case '*':
					result = calculator.multiply(num1, num2);
					break;
				case '/':
					result = calculator.divide(num1, num2);
					if (num2 == 0) {
						System.out.println("Division by zero is not allowed. Result set to 0.");
					}
					break;
			}
			System.out.println("The result is: " + result);
			input.close();
			System.out.println("Thank you for using the Calculator!");
		} 
		
		else if (option == 2) {
			System.out.println("Please enter the number of terms!");
			Scanner scann = new Scanner(System.in);
			int terms = scann.nextInt();
			calculator.fibonacci(terms);
		} 
		else if (option == 3){
			System.out.println("Please enter the number of elements of Array");
			Scanner scannn = new Scanner(System.in);
			int size = scannn.nextInt();
			
			System.out.println("Do you want to \n1)Add all elements in Array \n2)Average of all elements in Array");
			int choice = scan.nextInt();
			if ( choice == 1){
				calculator.sumOfArray(size);
			}
			else if (choice == 2){
				calculator.avgOfArray(size);
			}
			else{
				System.out.println("Enter valid input");
			}	
		}
		
		else{
			System.out.println("Enter valid input");
		}
    }
}

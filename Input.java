//Input.java


// Input.java
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear invalid input
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }

    public char getOperation() {
        System.out.print("Enter operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        while (op != '+' && op != '-' && op != '*' && op != '/') {
            System.out.println("Invalid operation. Please enter one of +, -, *, or /.");
            System.out.print("Enter operation (+, -, *, /): ");
            op = scanner.next().charAt(0);
        }
        return op;
    }

    public void close() {
        scanner.close();
    }
		
	int[] arrayInput(int size){ 
		Scanner scan = new Scanner(System.in); 
		System.out.print("\nEnter the numbers: "); 
		int[] array = new int[size];
		for (int i = 0; i < size; i++){ 
			array[i] = scan.nextInt();
		}	
        return array; 	
	}
}

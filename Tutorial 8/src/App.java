import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Guess a number 1 - 10");
		int value = scanner.nextInt();
		
		while(value !=7) {
			System.out.println("Wrong. You loose. Try again!");
			value = scanner.nextInt();
		}
		/*
		int value = 0;
		
		do {
			System.out.println("Guess a number 1 - 10");
			value = scanner.nextInt();
		}
		while(value !=7);
		*/
		System.out.println("Wow! You are good!");
		
	}
}

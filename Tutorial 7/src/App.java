import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("What's your name?");
		
		String line = input.nextLine();
		
		System.out.println("Where do you live?");
		
		String line2 = input.nextLine();
	
		System.out.println("How old are you");
		
		int line3 = input.nextInt();

	
		
		System.out.println("So your name is " + line + "\nYou are " + line3 + " years old" + "\nAnd you live in " + line2);

				
				
	}

}

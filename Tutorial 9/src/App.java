import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String command=input.nextLine();

		switch (command) {
		case "start":
			System.out.println("Machine is now on");
			break;
		case "stop":
			System.out.println("Machine is now stopped");
			break;
		default:
			System.out.println("Command not recognised");

		}
	}
}
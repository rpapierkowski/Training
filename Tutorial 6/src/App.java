
public class App {
	public static void main(String[] args) {

		int race = -2;
			
		while (race < 10) {
			if (race == -2) {
				System.out.println("Ready!");
			}
			
			else if (race == -1) {
				System.out.println("Steady!");
			}
			
			else if (race == 0) {
				System.out.println("Go!");
			}
			else if (race > 5) {
				break;
			}
			else if (race == 5) {
				System.out.println("System failure");
			}
			else {
				System.out.println("System is running!");
			}
			race++;
		}
	}

}

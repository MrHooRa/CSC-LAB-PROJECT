/*
 * 
 * Salman Alessa
 * UID: 439100011
 * 
 */
import java.util.Scanner;
public class testDate {

	//Static
	static Scanner input = new Scanner(System.in);
	
	// Create new object (static)
	static Date date = new Date();
	
	// Options()
	public static void Options() {
		System.out.print("-------------------"
				+ "\nPlease choose from the following options:- "
				+ "\n1- Display the date"
				+ "\n2- Change the date"
				+ "\n3- Increment the date"
				+ "\n4- Decrement the date"
				+ "\n5- Exit"
				+ "\n-------------------"
				+ "\nEnter your option: "
				);
		
		// Read form user
		int option = input.nextInt();
		
		
		// New line :D
		System.out.println();
				
		
		// If user choose option 1 > Display the date
		if(option == 1) {
			date.diplay();
			Options();
			
		// If user choose option 2 > Change the date
		}else if(option == 2) {
			
			System.out.print("Enter day, month, year: ");
			int day = input.nextInt();
			int month = input.nextInt();
			int year = input.nextInt();
			
			// Read them and set new values
			date.Read(day, month, year);
			Options();
			
		// If user choose option 3 > Increment the date
		}else if(option == 3) {
			
			date.Increment();
			Options();
			
		// If user choose option 4 > Decrement the date
		}else if(option == 4) {
			
			date.Decrement();
			Options();
			
		// If user choose option 5 > Exit
		}else if(option == 5) {
			
			System.out.println("Thanks, Goodbey!.");
			System.exit(0);
			
		}

	}
	
	public static void main(String[] args) {
		
		// Call method Options()
		Options();

	}

}

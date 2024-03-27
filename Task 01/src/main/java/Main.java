import java.util.Scanner;

public class Main {

	



	    public static void main(String[] args) {
	        Scanner inputName = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = inputName.nextLine();

	        String[] shortNameAndInitials = getShortName(name);
	        System.out.println("\nFull Name Title Case\t: " + shortNameAndInitials[0]);
	        System.out.println("\nName with initials\t: " + shortNameAndInitials[1]+shortNameAndInitials[2]);

	        inputName.close(); // Close the scanner to prevent resource leak
	    }

	    public static String[] getShortName(String fullName) {

	        String[] arrayName = fullName.split(" ");

	        StringBuilder initials = new StringBuilder();
	        for (int i = 0; i < arrayName.length - 1; i++) {
	            initials.append(arrayName[i].toUpperCase().charAt(0)).append(". ");
	        }

	        String lastName = arrayName[arrayName.length - 1];
	        String capitalizedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

	        StringBuilder changedName = new StringBuilder();

	        for (int i = 0; i < arrayName.length - 1; i++) {
	            String fullname = arrayName[i].substring(0, 1).toUpperCase() + arrayName[i].substring(1);
	            changedName.append(fullname).append(" ");
	        }
	        changedName.append(capitalizedLastName);

	        return new String[]{changedName.toString(), initials.toString(),capitalizedLastName.toString()};
	    }
	

}

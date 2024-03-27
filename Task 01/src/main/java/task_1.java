import java.util.Scanner;

public class task_1 {

	public static void main(String[] args) {
Scanner inputName = new Scanner(System.in);
        
        System.out.print("Enter your name:");
        String name = inputName.nextLine();

        String[] arrayName = name.split(" ");

        StringBuilder initials = new StringBuilder();
        for (int i = 0; i < arrayName.length - 1; i++) {
            initials.append(arrayName[i].toUpperCase().charAt(0)).append(". ");
        }

        String lastName = arrayName[arrayName.length - 1];
        String capitalizedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        StringBuilder ChangedName = new StringBuilder();
        
        for (int i = 0; i < arrayName.length - 1; i++) {
            String fullname = arrayName[i].substring(0, 1).toUpperCase() + arrayName[i].substring(1);
            ChangedName.append(fullname).append(" ");
        }
        ChangedName.append(capitalizedLastName);

        System.out.println("\nFull Name Title Case\t: " + ChangedName);
        System.out.println("\nName with initials\t: " +initials + capitalizedLastName);
	}

}

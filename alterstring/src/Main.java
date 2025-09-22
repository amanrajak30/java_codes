// write a menu driven program  for a given string
//input "This is a Simple String
//display length
//to display the count of characters
//to split the string
//if the given string has capital letters then convert it to lower case letters


import java.util.HashMap;
import java.util.Scanner;

class alterstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        while (true) {
            System.out.println("\nString Operations Menu:");
            System.out.println("1. Display Length");
            System.out.println("2. Display Character Count");
            System.out.println("3. Split the String");
            System.out.println("4. Convert to Lower Case (if applicable)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");

            if (scanner.hasNextInt()) { // Check if input is an integer
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 1:
                        System.out.println("Length of the string: " + inputString.length());
                        break;
                    case 2:
                        HashMap<Character, Integer> charCount = new HashMap<>();
                        for (char c : inputString.toCharArray()) {
                            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                        }
                        System.out.println("Character Count: " + charCount);
                        break;
                    case 3:
                        String[] splitString = inputString.split("\\s+"); // Split by any whitespace
                        System.out.print("Split String: ");
                        for (String s : splitString) {
                            System.out.print(s + " ");
                        }
                        System.out.println();
                        break;
                    case 4:
                        if (inputString.matches(".*[A-Z].*")) { // Check for capital letters using regex
                            String lowerCaseString = inputString.toLowerCase();
                            System.out.println("Lowercase String: " + lowerCaseString);
                        } else {
                            System.out.println("String does not contain any capital letters.");
                        }
                        break;
                    case 5:
                        System.out.println("Exiting program.");
                        scanner.close(); // Close the scanner
                        return; // Exit the program
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}



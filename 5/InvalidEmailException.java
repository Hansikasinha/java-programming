import java.util.*;

// Custom Exception Class
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class EmailValidator {

    // Method to validate email
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid Email! '@' symbol is missing.");
        }
        if (email.startsWith("@") || email.endsWith("@")) {
            throw new InvalidEmailException("Invalid Email! '@' cannot be at start or end.");
        }
        if (!email.contains(".")) {
            throw new InvalidEmailException("Invalid Email! Domain missing (e.g., .com, .in).");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        try {
            validateEmail(email);
            System.out.println("Valid Email!");
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

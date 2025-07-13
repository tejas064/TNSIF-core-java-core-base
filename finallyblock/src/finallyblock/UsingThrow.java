package finallyblock;

import java.util.Scanner;

// Custom Exception 1
class negativeException extends Exception {
    public negativeException() {
        super("Percentage cannot be negative.");
    }
}

// Custom Exception 2
class greatervalueException extends Exception {
    public greatervalueException() {
        super("Percentage cannot be greater than 100.");
    }
}

public class UsingThrow {

    static int acceptNumber() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Do NOT close System.in scanner here to avoid future input issues
        return n;
    }

    public static void main(String[] args) {

        int per;
        System.out.println("Enter your percentage:");

        per = acceptNumber();

        try {
            if (per < 0)
                throw new negativeException();
            else if (per > 100)
                throw new greatervalueException();
            else
                System.out.println("Valid percentage.");
        } catch (negativeException | greatervalueException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

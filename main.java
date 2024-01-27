import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User newUser = User.createNewAccount(scanner);

       // System.out.println("New user created: " + newUser);

        scanner.close();
    }
}



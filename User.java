

import java.util.Scanner;

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String gender;

    // Default constructor
    public User() {
    }

    // Parameterized constructor
    public User(Long id, String name, String email, String password, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Optionally, override the toString method for easy printing of user info
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

        // Method to create a new user account
    public static User createNewAccount(Scanner scanner) {
        User newUser = new User();

        System.out.println("Create a new account:");

        System.out.print("Enter name: ");
        newUser.setName(scanner.nextLine());

        System.out.print("Enter email: ");
        newUser.setEmail(scanner.nextLine());

        System.out.print("Enter password: ");
        newUser.setPassword(scanner.nextLine());

        System.out.print("Enter gender: ");
        newUser.setGender(scanner.nextLine());
        // Here, you might want to add logic to generate and set a unique user ID
        // newUser.setId(generatedId);

        return newUser;
    }
}

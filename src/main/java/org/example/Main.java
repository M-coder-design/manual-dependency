package org.example;

import org.example.notificationService.EmailNotificationService;
import org.example.notificationService.NotificationService;
import org.example.userRepository.InMemoryUserRepository;
import org.example.userRepository.UserRepository;
import org.example.userService.UserService;

public class Main {
    public static void main(String[] args) {
        // Directly creating dependencies in the Main class
        UserRepository userRepository = new InMemoryUserRepository();
        NotificationService notificationService = new EmailNotificationService();

        // Passing the dependencies manually to the UserService
        UserService userService = new UserService(userRepository, notificationService);

        // Using the UserService to register a user
        userService.registerUser("john_doe");
    }
}
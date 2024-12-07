package org.example.userService;

import org.example.notificationService.NotificationService;
import org.example.userRepository.UserRepository;

// UserService.java
public class UserService {
    private UserRepository userRepository;
    private NotificationService notificationService;

    // Constructor to initialize the dependencies
    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(String username) {
        userRepository.saveUser(username);
        notificationService.sendNotification("Welcome " + username + "!");
    }
}


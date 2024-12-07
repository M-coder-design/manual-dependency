package org.example.userRepository;

public class InMemoryUserRepository implements UserRepository {
    @Override
    public void saveUser(String username) {
        System.out.println("User " + username + " has been saved to the in-memory database.");
    }
}


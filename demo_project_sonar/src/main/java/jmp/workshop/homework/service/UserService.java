package jmp.workshop.homework.service;

import jmp.workshop.homework.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 13/07/2022
 */
@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public void createUser(User user) {
        users.stream()
            .filter(e -> e.getName().equals(user.getName()))
            .findFirst()
            .ifPresent(e -> users.add(user));
    }

    public User getOldest() {
        return users.stream()
            .max(Comparator.comparingInt(value -> value.getAge()))
            .get();
    }

    public String checkUserAge(int id) {
        Optional<User> optUser = users.stream()
            .filter(user -> user.getAge() == id)
            .findFirst();

        String result = null;
        if (optUser.isPresent()) {
            int userAge = optUser.get().getAge();
            switch (userAge) {
                default:
                    result = "User age: " + userAge;
                    break;
                case 7:
                    result = "Age for entering to school: " + userAge;
                    break;
                case 60:
                    result = "age for retirement: " + userAge;
            }
        }
        return result;
    }
}

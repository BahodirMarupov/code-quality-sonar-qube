package jmp.workshop.homework.controller;

import jmp.workshop.homework.model.User;
import jmp.workshop.homework.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 13/07/2022
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @GetMapping()
    public User getOldest() {
        return userService.getOldest();
    }

    @GetMapping("/{id}")
    public String checkUserAge(@PathVariable int id) {
        return userService.checkUserAge(id);
    }

}

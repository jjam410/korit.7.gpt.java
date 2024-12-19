package com.korit.Controller;

import com.korit.entity.User;
import com.korit.service.UserService;
import com.korit.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class UserController {

    @Setter
    private UserService userService;

    public void singIn() {

    }

    public void signUp(UserServiceImpl userService) {
        String username = "test";
        String password = "1234";
        String email = "test@gmail.com";
        User user = User.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();

        userService.add(user);
    }
}

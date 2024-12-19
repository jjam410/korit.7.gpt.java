package com.korit.main;

import com.korit.Controller.UserController;
import com.korit.service.UserService;
import com.korit.service.UserServiceImpl;

public class Main {
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    UserServiceImpl userService = new UserServiceImpl();
    UserController userController = new UserController(userService);
}

package com.example.SittersProject.user.web;

import com.example.SittersProject.user.model.User;
import com.example.SittersProject.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getUsers(Model model){
        List<User> users = userService.getAll();
        model.addAttribute("users", users);
        System.out.println(users);
        return "index";
    }

    @GetMapping("/id")
    public Optional<User> getUserById(Model model, Long id){
        Optional<User> user = userService.getUser(id);
        model.addAttribute("user", user);
        return user;
    }

    @GetMapping("/api/users")
    @ResponseBody
    public List<User> requestUsers(){

        return userService.getAll();
    }

}
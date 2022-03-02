package com.example.SittersProject.User.Controller;

import com.example.SittersProject.User.Model.User;
import com.example.SittersProject.User.Model.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("users")
public class UserController {
    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> getUsers(Model model){
        model.addAttribute("users", userService.getAll());
        List<User> users = userService.getAll();
        return users;
    }

    @GetMapping("/id")
    public Optional<User> getUserById(Model model, Long id){
        Optional<User> user = userService.getUser(id);
        model.addAttribute("user", user);
        return user;
    }
}

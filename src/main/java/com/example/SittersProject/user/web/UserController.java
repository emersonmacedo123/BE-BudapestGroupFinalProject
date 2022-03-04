package com.example.SittersProject.user.web;

import com.example.SittersProject.user.model.User;
import com.example.SittersProject.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getUsers(Model model){
        List<User> users = userService.getAll();
        model.addAttribute("users", users);
        System.out.println(users);
        return "index";
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(Model model, @PathVariable Long id){
        Optional<User> user = userService.getUser(id);
        model.addAttribute("user", user);
        return user;
    }

    @PostMapping("/user/new_user")
    public RedirectView addNewUser(Model model, @ModelAttribute User user){
        userService.addNewUser(user);
        return new RedirectView("index");
    }


//--------------API--------------\\

    @GetMapping("/api/users")
    @ResponseBody
    public List<User> requestUsers(){
        return userService.getAll();
    }

    @GetMapping("/api/user/{id}")
    @ResponseBody
    public Optional<User> requestUserById(@PathVariable Long id){
        Optional<User> user = userService.getUser(id);
        return user;
    }

}

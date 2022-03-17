package com.example.SittersProject.user.web;

import com.example.SittersProject.user.model.User;
import com.example.SittersProject.user.services.EmailExistsException;
import com.example.SittersProject.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/")
    public String getUsers(Model model){
        List<User> users = userService.getAll();
        model.addAttribute("users", users);
        System.out.println(users);
        return "index";
    }

    @GetMapping("/user/{id}")
    public String getUserById(Model model, @PathVariable Long id){
        Optional<User> user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user_profile";
    }

    @GetMapping("/registration")
    public String newRegistration(Model model){
        model.addAttribute("user", new User());
        return "login-registration";
    }

    @PostMapping("/registration")
    @ResponseBody //todo how is response body working
    public RedirectView submitRegistrationForm(@ModelAttribute User user) throws EmailExistsException {
        user.setVerified(false); //todo can remove?
        userService.registerNewUser(user);
        return new RedirectView("/");
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

package com.example.SittersProject.Controller;

import com.example.SittersProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/index")
    public String userIndex(Model model){
        model.addAttribute("users", userService.getAll());
        return "index";
    }
}

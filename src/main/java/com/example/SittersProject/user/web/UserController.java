package com.example.SittersProject.user.web;

import com.example.SittersProject.user.model.User;
import com.example.SittersProject.user.services.EmailExistsException;
import com.example.SittersProject.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin(origins = "*")
public class UserController {
    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity getUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity(users, HttpStatus.OK);
    }

    @GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity getUserById(@PathVariable Long id) {
        Optional<User> user = userService.getUser(id);
        if (user.isPresent()) {
            return new ResponseEntity(user.get(), HttpStatus.OK);
        }
        return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/registration")
    @ResponseBody
    public HttpStatus submitRegistrationForm(@RequestBody User user){
        try {
            userService.registerNewUser(user);
            return HttpStatus.OK;
        } catch (EmailExistsException e) {
            return HttpStatus.CONFLICT;
        }
    }

    @PostMapping("/is_email_available")
    @ResponseBody
    public boolean isEmailAvailable(@RequestBody String email){
        return userService.emailExists(email);
    }

    @PostMapping("/is_username_available")
    @ResponseBody
    public boolean isUsernameAvailable(@RequestBody String username){
        return userService.usernameExists(username);
    }
}



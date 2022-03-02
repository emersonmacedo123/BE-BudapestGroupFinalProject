package com.example.SittersProject.User.Model.Service;


import com.example.SittersProject.User.Model.User;
import com.example.SittersProject.User.Model.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//This is where we'll access user data

@Service
@RequiredArgsConstructor
public class UserService {
    private final userRepository repository;

    public List<User> getAll(){
        return repository.findAll();
    }

    public Optional<User> getUser(Long id) {
        return repository.findById(id);
    }
}

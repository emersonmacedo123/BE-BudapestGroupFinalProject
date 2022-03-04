package com.example.SittersProject.user.services;

import com.example.SittersProject.user.model.User;
import com.example.SittersProject.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public List<User> getAll(){
        return repository.findAll();
    }

    public Optional<User> getUser(Long id) {
        return repository.findById(id);
    }

    public void addNewUserDB(User user){
        repository.save(user);
    }

}

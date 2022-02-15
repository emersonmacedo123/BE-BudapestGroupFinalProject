package com.example.SittersProject.Service;


import com.example.SittersProject.Model.userEntity;
import com.example.SittersProject.Repository.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final userRepository repository;

    public List<userEntity> getAll(){
        return repository.findAll();
    }




}

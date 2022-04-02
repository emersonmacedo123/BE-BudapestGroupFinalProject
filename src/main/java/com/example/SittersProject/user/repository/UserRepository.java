package com.example.SittersProject.user.repository;

import com.example.SittersProject.postables.model.SitterRequest;
import com.example.SittersProject.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByEmailAddress(String email);

}

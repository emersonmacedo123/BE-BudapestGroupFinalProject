package com.example.SittersProject.User.Repository;

import com.example.SittersProject.User.Model.User;
import com.example.SittersProject.User.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRepository extends JpaRepository<User, Long> {

    public List<Client> getAllClients();



}

package com.example.SittersProject.Repository;

import com.example.SittersProject.Model.userEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRepository extends JpaRepository<userEntity, Long> {
}

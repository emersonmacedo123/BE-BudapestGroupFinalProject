package com.example.SittersProject.postables.respository;

import com.example.SittersProject.postables.model.SitterRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SitterRequestRepository extends JpaRepository<SitterRequest, Long> {

    List<SitterRequest> findAllByUserId(Long id);

    Optional<SitterRequest> findById(Long requestId);
}

package com.example.SittersProject.postable.request.respository;

import com.example.SittersProject.postable.request.model.SitterRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SitterRequestRepository extends JpaRepository<SitterRequest, Long> {

    Optional<SitterRequest> findById(Long requestId);
}

package com.example.SittersProject.postables.services;

import com.example.SittersProject.postables.model.SitterRequest;
import com.example.SittersProject.postables.respository.SitterRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SitterRequestService {

    private final SitterRequestRepository repository;

    public List<SitterRequest> getAll(){
        return repository.findAll();
    }

    public void addSitterRequestDB(SitterRequest request){
        repository.save(request);
    }

    public void removeSitterRequestDB(Long id){
        repository.deleteById(id);
    }

    public void updateSitterRequestDB(Long id){

    }

}

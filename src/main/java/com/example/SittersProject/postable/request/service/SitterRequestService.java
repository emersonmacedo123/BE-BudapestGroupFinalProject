package com.example.SittersProject.postable.request.service;

import com.example.SittersProject.postable.request.model.SitterRequest;
import com.example.SittersProject.postable.request.respository.SitterRequestRepository;
import com.example.SittersProject.user.model.Sitter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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

    public SitterRequest unpackHttpRequestToSitterRequest(RequestBody request) {
        request.

    }

}

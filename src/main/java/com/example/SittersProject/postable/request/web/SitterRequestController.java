package com.example.SittersProject.postable.request.web;


import com.example.SittersProject.postable.request.model.SitterRequest;
import com.example.SittersProject.postable.request.service.SitterRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SitterRequestController {
    public final SitterRequestService sitterRequestService;

    @Autowired
    public SitterRequestController(SitterRequestService sitterRequestService) {
        this.sitterRequestService = sitterRequestService;
    }

    @GetMapping("/sitter_search") //this will be our search method
    public List<SitterRequest> viewAllRequests() {
        return sitterRequestService.getAll();
    }

    //todo getting a 405 (method not allowed), not sure why, waiting on help from discord
    @DeleteMapping("/sitter_request/delete/{id}")
    public HttpStatus deleteSitterRequest(@PathVariable String id) {
        Long requestId = Long.parseLong(id);
        sitterRequestService.removeSitterRequestDB(requestId);
        return HttpStatus.OK;
    }

    @PutMapping("/sitter_request/edit/{id}")
    public HttpStatus editSitterRequest(@PathVariable String id) {
        Long requestId = Long.parseLong(id);
        sitterRequestService.updateSitterRequestDB(requestId);
        return HttpStatus.OK;
    }

    @PostMapping("/new_request")
    @ResponseBody
    public HttpStatus submitSitterRequestForm(@RequestBody SitterRequest sitterRequest) {
        sitterRequestService.addSitterRequestDB(sitterRequest);
        return HttpStatus.OK;
    }
}

package com.example.SittersProject.postables.web;


import com.example.SittersProject.postables.model.SitterRequest;
import com.example.SittersProject.postables.services.SitterRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SitterRequestController {
    public final SitterRequestService sitterRequestService;

    @Autowired
    public SitterRequestController(SitterRequestService sitterRequestService) {
        this.sitterRequestService = sitterRequestService;
    }

    @GetMapping("/all_requests")
    public String viewAllRequests(Model model){
        List<SitterRequest> sitterRequestList = sitterRequestService.getAll();
        model.addAttribute("sitterRequests", sitterRequestList);
        System.out.println("viewAllRequests method triggered");
        return "sitter_search";
    }

    @GetMapping("/new_request")
    public String newRequestForm(Model model){
        model.addAttribute("sitter_request", new SitterRequest());
        return "sitter_request_form";
    }

    @PostMapping("/new_request")
    @ResponseBody
    public void submitSitterRequestForm(@ModelAttribute SitterRequest sitterRequest){
        sitterRequestService.addSitterRequestDB(sitterRequest);
    }

    @GetMapping("/api/sitter_requests")
    @ResponseBody
    public List<SitterRequest> requestSitterRequests(){
        return sitterRequestService.getAll();
    }

}

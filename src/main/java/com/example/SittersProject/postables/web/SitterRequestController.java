package com.example.SittersProject.postables.web;


import com.example.SittersProject.postables.model.SitterRequest;
import com.example.SittersProject.postables.services.SitterRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SitterRequestController {
    public final SitterRequestService sitterRequestService;

    @Autowired
    public SitterRequestController(SitterRequestService sitterRequestService) {
        this.sitterRequestService = sitterRequestService;
    }

    @GetMapping("/sitter_search")
    public String viewAllRequests(Model model){
        List<SitterRequest> sitterRequestList = sitterRequestService.getAll();
        model.addAttribute("sitterRequests", sitterRequestList);
        return "sitter_search";
    }

    //todo delete not workin
    @DeleteMapping("/sitter_request/delete/{id}")
    public String deleteSitterRequest(@PathVariable String id){
        System.out.println("The delete method is being accessed!");
        Long requestId = Long.parseLong(id);
        sitterRequestService.removeSitterRequestDB(requestId);
        return "sitter_search";
    }

    @GetMapping("/new_request")
    public String newRequestForm(Model model){
        model.addAttribute("sitter_request", new SitterRequest());
        return "sitter_request_form";
    }

    @PostMapping("/new_request")
    @ResponseBody
    public RedirectView submitSitterRequestForm(@ModelAttribute SitterRequest sitterRequest){
        sitterRequestService.addSitterRequestDB(sitterRequest);
        return new RedirectView("sitter_search");
    }

    @GetMapping("/api/sitter_requests")
    @ResponseBody
    public List<SitterRequest> requestSitterRequests(){
        return sitterRequestService.getAll();
    }

}

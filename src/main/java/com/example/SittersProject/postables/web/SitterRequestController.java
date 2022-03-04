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


    //todo getting a 405 (method not allowed), not sure why, waiting on help from discord

    @DeleteMapping("/sitter_request/delete/{id}")
    public RedirectView deleteSitterRequest(@PathVariable String id){
        System.out.println("The delete method is being accessed!");
        Long requestId = Long.parseLong(id);
        sitterRequestService.removeSitterRequestDB(requestId);
        return new RedirectView("sitter_search");
    }

    //todo create an edit form/template/etc. --- best not to use this method right now
    @PutMapping("/sitter_request/edit/{id}")
    public RedirectView editSitterRequest(@PathVariable String id){
        System.out.println("The edit method is being accessed!");
        Long requestId = Long.parseLong(id);
        sitterRequestService.updateSitterRequestDB(requestId);
        return new RedirectView("sitter_search");
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

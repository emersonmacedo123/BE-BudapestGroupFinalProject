package com.example.SittersProject.postables.web;


import com.example.SittersProject.postables.model.SitterRequest;
import com.example.SittersProject.postables.services.SitterRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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

    @GetMapping("/sitter_search")
    public String viewAllRequests(Model model){
        List<SitterRequest> sitterRequestList = sitterRequestService.getAll();
        model.addAttribute("sitterRequests", sitterRequestList);
        System.out.println("viewAllRequests method triggered");
        return "sitter_search";
    }

    @RequestMapping(value="/sitter_request/delete/{id}", method = RequestMethod.DELETE)
    public String deleteSitterRequest(@PathVariable String id){
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
    public void submitSitterRequestForm(@ModelAttribute SitterRequest sitterRequest){
        sitterRequestService.addSitterRequestDB(sitterRequest);
    }

    @GetMapping("/api/sitter_requests")
    @ResponseBody
    public List<SitterRequest> requestSitterRequests(){
        return sitterRequestService.getAll();
    }

}

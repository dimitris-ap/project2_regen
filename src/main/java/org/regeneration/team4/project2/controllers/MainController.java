package org.regeneration.team4.project2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/dashboard")
    public String dashboard(Model model){
        //model.addAttribute("name", name);
        return "doc_search";
    }
}
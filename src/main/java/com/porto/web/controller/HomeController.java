package com.porto.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.porto.web.model.Container;
import com.porto.web.model.db.ContainerRepo;

@Controller
public class HomeController {
    
    @Autowired
    private ContainerRepo containerRepo;

    @GetMapping({"/home", "/"})
    public String home(Model model) {
        List<Container> containers = containerRepo.findAll();

        model.addAttribute("containers", containers);
        return "home";
    }


}

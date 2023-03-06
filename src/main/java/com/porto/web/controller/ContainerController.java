package com.porto.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.porto.web.model.Container;
import com.porto.web.model.db.ContainerRepo;
import com.porto.web.service.ContainerService;

@Controller
public class ContainerController {

    @Autowired
    private ContainerService service;

    @Autowired
    ContainerRepo containerRepo;

    // Acessa o formulario
    @GetMapping("/form")
    public String ContainersForm( Container container) {

        return "addContainersForm";

    }

    // Adiciona novo Container
    @PostMapping("/add")
    public String adicionar(@ModelAttribute("container") Container container) {

        service.salvarContainers(container);

        return "redirect:/home";
    }

    // Acessa o formulario de edição
    @GetMapping("form/{id}")
    public String editForm(Model model, @PathVariable(name = "id") Long id) {

        model.addAttribute("containers", service.getById(id));
        return "atualizaForm";

    }

    // Atualiza container
    @PostMapping("update/{id}")
    public String atualizaContainer(Container container, @PathVariable Long id) {

        containerRepo.save(container);
        return "redirect:/home";
    }

    // Apagar container

    @GetMapping("delete/{id}")
    public String deletar(@PathVariable Long id) {
        service.apagaContainer(id);
        return "redirect:/home";
    }

}

package com.pasteleria.controller;

import com.pasteleria.domain.Utensilios;
import com.pasteleria.service.UtensiliosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/utensilios")
public class UtensiliosController {

    @Autowired
    private UtensiliosService utensiliosService;

    @GetMapping("/listado")
    public String listado(Model model) {
        List<Utensilios> utensilios = utensiliosService.getUtensilios();
        model.addAttribute("utensilios", utensilios);
        
        return "/utensilios/listado";

    }

    @GetMapping("/nuevo")
    public String utensiliosNuevo(Utensilios utensilios) {
        return "/utensilios/modifica";
    }

    @PostMapping("/guardar")
    public String utensiliosGuardar(Utensilios utensilios) {
        utensiliosService.save(utensilios);
        return "redirect:/utensilios/listado";
    }

    @GetMapping("/eliminar/{numero_utensilios}")
    public String utensiliosEliminar(Utensilios utensilios) {
        utensiliosService.delete(utensilios);
        return "redirect:/utensilios/listado";
    }

    @GetMapping("/modificar/{numero_utensilios}")
    public String utensiliosModificar(Utensilios utensilios, Model model) {
        utensilios = utensiliosService.getUtensilios(utensilios);
        model.addAttribute("utensilios", utensilios);
        return "/utensilios/modifica";
    }

}

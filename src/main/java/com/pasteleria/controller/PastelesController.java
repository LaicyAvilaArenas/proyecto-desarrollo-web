package com.pasteleria.controller;

import com.pasteleria.domain.Pasteles;
import com.pasteleria.service.PastelesService;
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
@RequestMapping("/pasteles")
public class PastelesController {

    @Autowired
    private PastelesService pastelesService;

    @GetMapping("/listado")
    public String listado(Model model) {
        List<Pasteles> pasteles = pastelesService.getPasteles();
        model.addAttribute("pasteles", pasteles);
        
        return "/pasteles/listado";

    }

    @GetMapping("/nuevo")
    public String pastelesNuevo(Pasteles pasteles) {
        return "/pasteles/modifica";
    }

    @PostMapping("/guardar")
    public String pastelesGuardar(Pasteles pasteles) {
        pastelesService.save(pasteles);
        return "redirect:/pasteles/listado";
    }

    @GetMapping("/eliminar/{numero_pastel}")
    public String pastelesEliminar(Pasteles pasteles) {
        pastelesService.delete(pasteles);
        return "redirect:/pasteles/listado";
    }

    @GetMapping("/modificar/{numero_pastel}")
    public String pastelesModificar(Pasteles pasteles, Model model) {
        pasteles = pastelesService.getPasteles(pasteles);
        model.addAttribute("pasteles", pasteles);
        return "/pasteles/modifica";
    }

}

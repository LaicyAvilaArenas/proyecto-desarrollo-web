package com.pasteleria.controller;

import com.pasteleria.domain.Finanzas;
import com.pasteleria.service.FinanzasService;
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
@RequestMapping("/finanzas")
public class FinanzasController {

    @Autowired
    private FinanzasService finanzasService;

    @GetMapping("/listado")
    public String listado(Model model) {
        List<Finanzas> finanzas = finanzasService.getFinanzas();
        model.addAttribute("finanzas", finanzas);
        
        return "/finanzas/listado";

    }

    @GetMapping("/nuevo")
    public String finanzasNuevo(Finanzas finanzas) {
        return "/finanzas/modifica";
    }

    @PostMapping("/guardar")
    public String finanzasGuardar(Finanzas finanzas) {
        finanzasService.save(finanzas);
        return "redirect:/finanzas/listado";
    }

    @GetMapping("/eliminar/{numero_mes}")
    public String finanzasEliminar(Finanzas finanzas) {
        finanzasService.delete(finanzas);
        return "redirect:/finanzas/listado";
    }

    @GetMapping("/modificar/{numero_mes}")
    public String finanzasModificar(Finanzas finanzas, Model model) {
        finanzas = finanzasService.getFinanzas(finanzas);
        model.addAttribute("finanzas", finanzas);
        return "/finanzas/modifica";
    }

}

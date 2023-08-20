package com.pasteleria.controller;

import com.pasteleria.domain.Administradores;
import com.pasteleria.service.AdministradoresService;
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
@RequestMapping("/administradores")
public class AdministradoresController {

    @Autowired
    private AdministradoresService administradoresService;

    @GetMapping("/listado")
    public String listado(Model model) {
        List<Administradores> administradores = administradoresService.getAdministradores();
        model.addAttribute("administradores", administradores);
        model.addAttribute("totaladministradores", administradores.size());
        return "/administradores/listado";

    }

    @GetMapping("/nuevo")
    public String administradoresNuevo(Administradores administradores) {
        return "/administradores/modifica";
    }

    @PostMapping("/guardar")
    public String administradoresGuardar(Administradores administradores) {
        administradoresService.save(administradores);
        return "redirect:/administradores/listado";
    }

    @GetMapping("/eliminar/{numero_admin}")
    public String administradoresEliminar(Administradores administradores) {
        administradoresService.delete(administradores);
        return "redirect:/administradores/listado";
    }

    @GetMapping("/modificar/{numero_admin}")
    public String administradoresModificar(Administradores administradores, Model model) {
        administradores = administradoresService.getAdministradores(administradores);
        model.addAttribute("administradores", administradores);
        return "/administradores/modifica";
    }

}

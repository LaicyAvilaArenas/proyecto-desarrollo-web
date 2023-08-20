package com.pasteleria.controller;

import com.pasteleria.domain.Categorias;
import com.pasteleria.service.CategoriasService;
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
@RequestMapping("/categorias")
public class CategoriasController {

    @Autowired
    private CategoriasService categoriasService;

    @GetMapping("/listado")
    public String listado(Model model) {
        List<Categorias> categorias = categoriasService.getCategorias();
        model.addAttribute("categorias", categorias);
        
        return "/categorias/listado";

    }

    @GetMapping("/nuevo")
    public String categoriasNuevo(Categorias categorias) {
        return "/categorias/modifica";
    }

    @PostMapping("/guardar")
    public String categoriasGuardar(Categorias categorias) {
        categoriasService.save(categorias);
        return "redirect:/categorias/listado";
    }

    @GetMapping("/eliminar/{numero_categoria}")
    public String categoriasEliminar(Categorias categorias) {
        categoriasService.delete(categorias);
        return "redirect:/categorias/listado";
    }

    @GetMapping("/modificar/{numero_categoria}")
    public String categoriasModificar(Categorias categorias, Model model) {
        categorias = categoriasService.getCategorias(categorias);
        model.addAttribute("categorias", categorias);
        return "/categorias/modifica";
    }

}

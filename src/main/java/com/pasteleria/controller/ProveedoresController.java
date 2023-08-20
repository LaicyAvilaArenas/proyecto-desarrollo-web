package com.pasteleria.controller;

import com.pasteleria.domain.Proveedores;
import com.pasteleria.service.ProveedoresService;
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
@RequestMapping("/proveedores")
public class ProveedoresController {

    @Autowired
    private ProveedoresService proveedoresService;

    @GetMapping("/listado")
    public String listado(Model model) {
        List<Proveedores> proveedores = proveedoresService.getProveedores();
        model.addAttribute("proveedores", proveedores);
        
        return "/proveedores/listado";

    }

    @GetMapping("/nuevo")
    public String proveedoresNuevo(Proveedores proveedores) {
        return "/proveedores/modifica";
    }

    @PostMapping("/guardar")
    public String proveedoresGuardar(Proveedores proveedores) {
        proveedoresService.save(proveedores);
        return "redirect:/proveedores/listado";
    }

    @GetMapping("/eliminar/{numero_proveedor}")
    public String proveedoresEliminar(Proveedores proveedores) {
        proveedoresService.delete(proveedores);
        return "redirect:/proveedores/listado";
    }

    @GetMapping("/modificar/{numero_proveedor}")
    public String proveedoresModificar(Proveedores proveedores, Model model) {
        proveedores = proveedoresService.getProveedores(proveedores);
        model.addAttribute("proveedores", proveedores);
        return "/proveedores/modifica";
    }

}

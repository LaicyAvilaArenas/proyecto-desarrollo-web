package com.pasteleria.controller;

import com.pasteleria.domain.Productos;
import com.pasteleria.service.ProductosService;
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
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @GetMapping("/listado")
    public String listado(Model model) {
        List<Productos> productos = productosService.getProductos();
        model.addAttribute("productos", productos);
        
        return "/productos/listado";

    }

    @GetMapping("/nuevo")
    public String productosNuevo(Productos productos) {
        return "/productos/modifica";
    }

    @PostMapping("/guardar")
    public String productosGuardar(Productos productos) {
        productosService.save(productos);
        return "redirect:/productos/listado";
    }

    @GetMapping("/eliminar/{numero_productos}")
    public String productosEliminar(Productos productos) {
        productosService.delete(productos);
        return "redirect:/productos/listado";
    }

    @GetMapping("/modificar/{numero_productos}")
    public String productosModificar(Productos productos, Model model) {
        productos = productosService.getProductos(productos);
        model.addAttribute("productos", productos);
        return "/productos/modifica";
    }

}

 
package com.pasteleria.controller;

import com.pasteleria.domain.Pedidos;
import com.pasteleria.service.PedidosService;
import com.pasteleria.service.FirebaseStorageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;




@Controller
@RequestMapping("/pedidos")
public class PedidosController {
 
    @Autowired
    private PedidosService pedidosService;
    
//    @GetMapping ("/listado")
//    public String listado(Model model){
//        
////        
////        List<Pedidos> pedidos = pedidosService.getPedidos(false);
////        model.addAttribute("pedidos",pedidos);
////        model.addAttribute("totalpedidos",pedidos.size());
////        return "/pedidos/listado";
//        
//    }
    @GetMapping("/nuevo")
    public String pedidosNuevo(Pedidos pedidos) {
        return "/pedidos/modifica";
    }

    @Autowired
    private FirebaseStorageService firebaseStorageService;
    
    @PostMapping("/guardar")
    public String pedidosGuardar(Pedidos pedidos) {        
        pedidosService.save(pedidos);
        return "redirect:/pedidos/listado";
    }

    @GetMapping("/eliminar/{numero_pedido}")
    public String pedidosEliminar(Pedidos pedidos) {
        pedidosService.delete(pedidos);
        return "redirect:/pedidos/listado";
    }

    @GetMapping("/modificar/{numero_pedido}")
    public String pedidosModificar(Pedidos pedidos, Model model) {
        pedidos = pedidosService.getPedidos(pedidos);
        model.addAttribute("pedidos", pedidos);
        return "/pedidos/modifica";
    }  
}
